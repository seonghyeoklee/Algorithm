package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeeklyChallenge4 {

    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";

        Map<String, Integer> si = new HashMap<>();
        Map<String, Integer> contents = new HashMap<>();
        Map<String, Integer> hardware = new HashMap<>();
        Map<String, Integer> portal = new HashMap<>();
        Map<String, Integer> game = new HashMap<>();

        for (String str : table) {
            String[] s = str.split(" ");
            for (int i = 0; i < s.length; i++) {
                String key = s[i];
                Integer value = s.length - i;

                if (str.startsWith("SI")) {
                    si.put(key, value);
                } else if (str.startsWith("CONTENTS")) {
                    contents.put(key, value);
                } else if (str.startsWith("HARDWARE")) {
                    hardware.put(key, value);
                } else if (str.startsWith("PORTAL")) {
                    portal.put(key, value);
                } else if (str.startsWith("GAME")) {
                    game.put(key, value);
                }
            }
        }

        int[] total = new int[5];

        for (int i = 0; i < languages.length; i++) {
            total[0] += si.getOrDefault(languages[i], 0) * preference[i];
            total[1] += contents.getOrDefault(languages[i], 0) * preference[i];
            total[2] += hardware.getOrDefault(languages[i], 0) * preference[i];
            total[3] += portal.getOrDefault(languages[i], 0) * preference[i];
            total[4] += game.getOrDefault(languages[i], 0) * preference[i];
        }

        String[] result = new String[]{"", "", "", "", ""};
        for (int i = 0; i < result.length; i++) {
            if (total[i] == Arrays.stream(total).max().getAsInt()) {
                if (i == 0) {
                    result[i] = "SI";
                } else if (i == 1) {
                    result[i] = "CONTENTS";
                } else if (i == 2) {
                    result[i] = "HARDWARE";
                } else if (i == 3) {
                    result[i] = "PORTAL";
                } else if (i == 4) {
                    result[i] = "GAME";
                }
            }
        }

        Arrays.sort(result);

        for (String x : result) {
            if (!"".equals(x)) {
                answer = x;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        WeeklyChallenge4 weeklyChallenge4 = new WeeklyChallenge4();

        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
//        String[] languages = {"PYTHON", "C++", "SQL"};
        String[] languages = {"JAVA", "JAVASCRIPT"};

//        int[] preference = {7, 5, 5};
        int[] preference = {7, 5};

        System.out.println(weeklyChallenge4.solution(table, languages, preference));
    }
}
