package inflearn.recursive;

import java.util.Scanner;

class Main0704 {
    static int[] fibo;
    public static int recursive(int n) {
        if (fibo[n] > 0) {
            return fibo[n];
        }
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = recursive(n - 1) + recursive(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        fibo = new int[n + 1];
        recursive(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
