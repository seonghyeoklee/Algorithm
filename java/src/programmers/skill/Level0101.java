package programmers.skill;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Level0101 {
    public boolean solution(String s) {
        boolean answer = true;

        Pattern pattern1 = Pattern.compile("^[0-9]{4}$");
        Pattern pattern2 = Pattern.compile("^[0-9]{6}$");
        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);

        if (matcher1.find() || matcher2.find()) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        Level0101 level01 = new Level0101();

//        String s = "a234";
        String s = "1234";

        System.out.println(level01.solution(s));
    }
}
