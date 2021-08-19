package programmers;

import java.util.*;

public class WeeklyChallenge3 {

    boolean[][] visitBoard;
    boolean[][] visitTable;
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    int answer = 0;

    public int solution(int[][] game_board, int[][] table) {
        int boardSize = game_board.length;
        visitBoard = new boolean[boardSize][boardSize];
        visitTable = new boolean[boardSize][boardSize];

        // game_board 에서 '빈 공간' 을 하나 씩 추출
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {


                if (game_board[i][j] == 1 || visitBoard[i][j]) { // '빈 공간' 아니거나 이미 방문한 공간인 경우 스킵
                    continue;
                }


                // 빈 공간 영역이 존재하면 bfs로 해당 공간의 좌표를 찾아 클래스(Position) 생성 후 리스트로 반환
                // 좌표 리스트를 가지고 2차원 배열에 그려준다 (0,0 부터 시작하도록)
                List<Position> emptyCoord = extractBlock(game_board, new Position(i, j), true);
                int[][] empty = makeBlock(emptyCoord);


                // table 에서 '블럭' 영역 추출
                match:
                for (int k = 0; k < boardSize; k++) {
                    for (int l = 0; l < boardSize; l++) {

                        if (table[k][l] == 0 || visitTable[k][l]) {
                            continue;
                        }

                        // '블럭' 영역의 좌표(Position) 를 가지는 리스트 반환
                        List<Position> blockCoord = extractBlock(table, new Position(k, l), false);

                        if (emptyCoord.size() != blockCoord.size()) { // '빈 영역' 과 '블럭' 의 좌표 갯수가 다르면 스킵
                            continue;
                        }

                        // '블럭' 좌표 리스트를 가지고 2차원 배열에 그려준다
                        // 'row', 'col' 길이를 따로 뽑아주는 이유는 '블럭' 회전 시 2차원 배열에 0,0 부터 그리기 위함
                        int[][] block = makeBlock(blockCoord);
                        int row = blockCoord.get(0).maxX - blockCoord.get(0).minX + 1; // '블럭' 의 행 길이
                        int col = blockCoord.get(0).maxY - blockCoord.get(0).minY + 1; // '블럭' 의 열 길이


                        // '빈 영역' 과 '블럭' 모양 확인
                        for (int z = 0; z < 4; z++) {

                            if (isSame(empty, block)) { // 모양이 동일한 경우 table 에서 해당영역들은 '0'으로 블럭을 지워준다
                                for (int x = 0; x < blockCoord.size(); x++) {
                                    Position rollback = blockCoord.get(x);
                                    table[rollback.x][rollback.y] = 0;
                                }
                                answer += blockCoord.size();
                                break match;
                            }

                            // 매칭이 안된경우 회전
                            // row, col의 길이를 스왑하는 이유는 '90'도 회전 시 행, 열 길이가 바뀌기 때문에 2차원 배열 0,0 부터 그리기 위함
                            block = rotateBlock(block, row, col);
                            int temp = row;
                            row = col;
                            col = temp;
                        }
                    }
                }

                visitTable = new boolean[boardSize][boardSize];
            }
        }

        return answer;
    }

    public List<Position> extractBlock(int[][] board, Position p, boolean isBoard) {
        int boardSize = board.length;
        List<Position> list = new ArrayList<>();
        Queue<Position> eq = new LinkedList<>();

        eq.offer(p);

        if (isBoard) {
            visitBoard[p.x][p.y] = true;
        } else {
            visitTable[p.x][p.y] = true;
        }

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        while (!eq.isEmpty()) {
            Position start = eq.poll();
            list.add(start);
            minX = Math.min(start.x, minX);
            minY = Math.min(start.y, minY);
            maxX = Math.max(start.x, maxX);
            maxY = Math.max(start.y, maxY);

            for (int i = 0; i < 4; i++) {
                int row = start.x + dx[i];
                int col = start.y + dy[i];

                if (row < 0 || col < 0 || row > boardSize - 1 || col > boardSize -1) continue;

                if (isBoard) {
                    if (board[row][col] == 1 || visitBoard[row][col]) continue;
                    visitBoard[row][col] = true;
                } else {
                    if (board[row][col] == 0 || visitTable[row][col]) continue;
                    visitTable[row][col] = true;
                }

                eq.offer(new Position(row, col));
            }
        }

        list.get(0).minX = minX;
        list.get(0).minY = minY;
        list.get(0).maxX = maxX;
        list.get(0).maxY = maxY;

        return list;
    }

    public int[][] makeBlock(List<Position> list) {
        int[][] result = new int[50][50];
        int minX = list.get(0).minX;
        int minY = list.get(0).minY;

        int emptyBlockSize = list.size();
        for (int i = 0; i < emptyBlockSize; i++) {
            Position p = list.get(i);
            result[p.x - minX][p.y - minY] = 1;
        }

        return result;
    }

    public boolean isSame(int[][] empty, int[][] block) {
        for (int i = 0; i < empty.length; i++) {
            for (int j = 0; j < empty[0].length; j++) {
                if (block[i][j] != empty[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] rotateBlock(int[][] block, int row, int col) { // 회전
        int[][] tempBlock = new int[50][50];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tempBlock[j][row - 1 - i] = block[i][j];
            }
        }
        return tempBlock;
    }

    class Position {
        int x;
        int y;
        int minX;
        int minY;
        int maxX;
        int maxY;
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        WeeklyChallenge3 wc = new WeeklyChallenge3();

        int[][] game_board = {{1, 1, 0, 0, 1, 0}, {0, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 0, 1}, {1, 1, 0, 1, 1, 1}, {1, 0, 0, 0, 1, 0}, {0, 1, 1, 1, 0, 0}};
        int[][] table = {{1, 0, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 1, 1}, {0, 0, 1, 0, 0, 0}, {1, 1, 0, 1, 1, 0}, {0, 1, 0, 0, 0, 0}};
//        int[][] game_board = {{0, 0, 0}, {1, 1, 0}, {1, 1, 1}};
//        int[][] table = {{1, 1, 1}, {1, 0, 0}, {0, 0, 0}};
        int answer = wc.solution(game_board, table);

        System.out.println("answer = " + answer);
    }
}


