package inflearn.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Main0811 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;

    public void BFS() {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(1, 1));
        board[1][1] = 1;

        while (!Q.isEmpty()) {
            Point cur = Q.poll();

            for (int j = 0; j < dx.length; j++) {
                int nx = cur.x + dx[j];
                int ny = cur.y + dy[j];

                if (nx > 0 && nx < 8 && ny > 0 && ny < 8 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[cur.x][cur.y] + 1;
                }
            }
        }

    }

    public static void main(String[] args) {
        Main0811 main = new Main0811();
        Scanner sc = new Scanner(System.in);

        board = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        main.BFS();

        if (dis[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }
    }
}
