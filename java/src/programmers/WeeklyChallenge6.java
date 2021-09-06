package programmers;

import java.util.*;

public class WeeklyChallenge6 {

    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = {};

        for (int i = 0; i < head2head.length; i++) {
            double win = 0;
            double lose = 0;

            int weightCnt = 0;

            for (int j = 0; j < head2head[i].toCharArray().length; j++) {
                if (i != j) {
                    char vs = head2head[i].charAt(j);

                    if (vs == 'L') {
                        lose += 1;
                    } else if (vs == 'W') {

                        win += 1;

                        int myWeight = weights[i];
                        int otherWeight = weights[j];

                        //자기보다 무거운 복서를 이긴 횟수
                        if (myWeight < otherWeight) {
                            weightCnt += 1;
                        }
                    } else {
                        //무전적
                    }

                }
            }
            double winRate = (win / (win + lose) * 100);

            System.out.println("승: " + win + " / 패: " + lose + " / 승률: " + winRate + " / 무거운 복서를 이긴 횟수:" + weightCnt);
        }

        //sort condition
        //1. 전체 승률이 높은 복서 (다른 복서랑 붙어본 적이 없는 복서의 승률은 0%)
        //2. 승률이 동일한 복서의 번호들 중에서는 자신보다 몸무게가 무거운 복서를 이긴 횟수가 많은 복서의 번호가 앞쪽
        //3. 자신보다 무거운 복서를 이긴 횟수까지 동일한 복서의 번호들 중에서는 자기 몸무게가 무거운 복서의 번호가 앞쪽
        //4. 자기 몸무게까지 동일한 복서의 번호들 중에서는 작은 번호가 앞쪽

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

