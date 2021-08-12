package inflearn.recursive;

import java.util.Scanner;

class Main0701 {
    public static void recursive(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");

        recursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        recursive(n);
    }
}
