package inflearn.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main0105 {
    public String solution(String str) {
        int lt = 0;
        int rt = str.length() - 1;
        char[] ch = str.toCharArray();

        while (lt < rt) {
            if (!Character.isAlphabetic(ch[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(ch[rt])) {
                rt--;
            } else {
                char tmp = ch[rt];
                ch[rt] = ch[lt];
                ch[lt] = tmp;
                lt++;
                rt--;
            }
        }

        String answer = String.valueOf(ch);

        return answer;
    }

    public static void main(String[] args) {
        Main0105 main = new Main0105();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
