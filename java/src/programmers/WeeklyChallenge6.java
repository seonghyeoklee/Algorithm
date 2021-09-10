package programmers;

import java.util.*;

public class WeeklyChallenge6 {

    class Boxer {
        int id;
        int weight;
        int win;
        int numGame;
        int weightCnt;
        double winRate;

        public Boxer(int id, int weight) {
            this.id = id;
            this.weight = weight;
            this.win = 0;
            this.numGame = 0;
            this.weightCnt = 0;
            this.winRate = 0.0;
        }
    }

    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = {};
        int len = weights.length;

        List<Boxer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(new Boxer(i + 1, weights[i]));
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (head2head[i].charAt(j) != 'N') {
                    list.get(i).numGame++;
                }

                if (head2head[i].charAt(j) == 'W') {
                    list.get(i).win++;
                    if (list.get(j).weight > list.get(i).weight) {
                        list.get(i).weightCnt++;
                    }
                }
            }
        }

        list.stream().forEach(s-> {
            if (s.numGame > 0) {
                s.winRate = (double) s.win / s.numGame * 100;
            }
        });

        list.sort((a, b)->{
            if (a.winRate != b.winRate) {
                return (b.winRate - a.winRate) > 0 ? 1 : -1;
            } else if (a.weightCnt != b.weightCnt) {
                return b.weightCnt - a.weightCnt;
            } else if (a.weight != b.weight) {
                return b.weight - a.weight;
            } else {
                return a.id - b.id;
            }
        });

        answer = list.stream().mapToInt(a -> a.id).toArray();
        return answer;
    }

    public static void main(String[] args) {
        WeeklyChallenge6 weeklyChallenge6 = new WeeklyChallenge6();

        int[] weights = {50, 82, 75, 120};
        String[] head2head = {"NLWL", "WNLL", "LWNW", "WWLN"};
        //result [3,4,1,2]

        System.out.println(weeklyChallenge6.solution(weights, head2head));
    }
}

