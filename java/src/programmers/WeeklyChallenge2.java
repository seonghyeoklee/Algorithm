package programmers;

import java.util.Arrays;

public class WeeklyChallenge2 {
    public int count(int[] score, int val) {
        int cnt = 0;
        for (int x : score) {
            if (x == val) {
                cnt++;
            }
        }
        return cnt;
    }

    public String solution(int[][] scores) {
        String answer = "";

        for (int i = 0; i < scores.length; i++) {
            int[] score = new int[scores.length];

            for (int j = 0; j < scores[i].length; j++) {
                score[j] = scores[j][i];
            }

            int max = Arrays.stream(score).max().getAsInt();
            int min = Arrays.stream(score).min().getAsInt();
            double avg = 0.0;

            if (score[i] == max || score[i] == min) {
                if (count(score, score[i]) > 1) {
                    avg = (double) Arrays.stream(score).sum() / score.length;
                } else {
                    score[i] = 0;
                    avg = (double) Arrays.stream(score).sum() / (score.length - 1);
                }
            } else {
                avg = (double) Arrays.stream(score).sum() / score.length;
            }

            if (avg >= 90) {
                answer += "A";
            } else if (avg >= 80) {
                answer += "B";
            } else if (avg >= 70) {
                answer += "C";
            } else if (avg >= 50) {
                answer += "D";
            } else {
                answer += "F";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        WeeklyChallenge2 weeklyChallenge1 = new WeeklyChallenge2();

        int[][] scores = {{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}};
        
        String answer = weeklyChallenge1.solution(scores);

        //"FBABD"
        System.out.println("answer = " + answer);
    }
}