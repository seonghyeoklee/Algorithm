package inflearn.string;

import java.util.Scanner;

class Main0104 {

    public void solution(String[] arr) {
        for (String s : arr) {
            String reverse = new StringBuilder(s).reverse().toString();
            System.out.println(reverse);
        }
    }

    public static void main(String[] args) {
        Main0104 main = new Main0104();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        main.solution(arr);
    }
}
