package programmers.kakao.blind2021;

import java.util.Stack;

public class Main01 {

    public String solution(String new_id) {
        String answer = "";

        System.out.println("0단계 : " + new_id);
        new_id = new_id.toLowerCase();
        System.out.println("1단계 : " + new_id);

        char[] arr1 = new_id.toCharArray();
        new_id = "";

        for (char ch : arr1) {
            // - 45
            // . 46
            // _ 95
            if ((ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57) || ch == 45 || ch == 46 || ch == 95) {
                new_id += ch;
            }
        }
        System.out.println("2단계 : " + new_id);

        Stack<Character> stack = new Stack<>();
        char[] arr2 = new_id.toCharArray();
        new_id = "";

        for (char ch : arr2) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (ch == '.' && stack.peek() == '.') {
                continue;
            } else {
                stack.push(ch);
            }
        }

        for (char ch : stack) {
            new_id += ch;
        }

        System.out.println("3단계 : " + new_id);

        if (new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }

        if (new_id.length() > 0) {
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        System.out.println("4단계 : " + new_id);

        if (new_id.length() == 0) {
            new_id = "a";
        }

        System.out.println("5단계 : " + new_id);

        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        System.out.println("6단계 : " + new_id);

        if (new_id.length() <= 2 && new_id.length() > 0) {
            String last = new_id.substring(new_id.length() - 1);
            while (new_id.length() < 3) {
                new_id += last;
            }
        }

        System.out.println("7단계 : " + new_id);

        answer = new_id;

        return answer;
    }

    public static void main(String[] args) {
        Main01 main = new Main01();

        String new_id = "...!@BaT#*..y.abcdefghijklm.";
//        String new_id = "z-+.^.";
//        String new_id = "=.=";
//        String new_id = "123_.def";
//        String new_id = "abcdefghijklmn.p";

        System.out.println(main.solution(new_id));
    }
}
