package inflearn.dfs;

import java.util.Scanner;

class Main0803 {

    static int answer = Integer.MIN_VALUE;
    static int n, m;

    public void DFS(int L, int sum, int score, int[][] arr) {
        if (L == n) {
            if (sum <= m) {
                answer = Math.max(answer, score);
            }
        } else {
            DFS(L + 1, sum + arr[L][1], score+arr[L][0], arr);
            DFS(L + 1, sum, score, arr);
        }
    }

    public static void main(String[] args) {
        Main0803 main = new Main0803();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        main.DFS(0, 0, 0, arr);
        System.out.println(answer);
    }
}
