package inflearn.string;

import java.util.Scanner;

class Main0112 {

    public String solution(int n, String str) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);

            answer += (char) num;
            str = str.substring(7);
        }


        return answer;
    }

    public static void main(String[] args) {
        Main0112 main = new Main0112();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(main.solution(n, str));
    }
}
