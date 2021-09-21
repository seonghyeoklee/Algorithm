package inflearn.string;

import java.util.Scanner;

class Main0109 {

    public String solution(String str) {
        String answer = "";

        for (char ch : str.toCharArray()) {
            if (ch >= 48 && ch <= 57) {
                answer += ch;
            }
        }

        while (answer.charAt(0) == '0') {
            answer = answer.substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main0109 main = new Main0109();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
