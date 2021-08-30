package programmers;

import java.util.*;

public class WeeklyChallenge5 {

    static String[] dic = new String[]{"A", "E", "I", "O", "U"};
    static int n = 5;
    static Set<String> set = new HashSet<>();

    public void DFS(int L, String tmp) {
        if (L == n + 1) {
            set.add(tmp);
        } else {
            DFS(L + 1, tmp);
            for (int i = 0; i < dic.length; i++) {
                DFS(L + 1, tmp + dic[i]);
            }
        }
    }

    public int solution(String word) {
        int answer = 0;

        DFS(1, "");

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);

        for (String str : list) {
            if (!str.equals(word)) {
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        WeeklyChallenge5 weeklyChallenge5 = new WeeklyChallenge5();

//        String word = "AAAAE";
//        String word = "I";
        String word = "EIO";

        System.out.println(weeklyChallenge5.solution(word));
    }
}
