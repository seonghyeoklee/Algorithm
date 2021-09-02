package inflearn.dfs;

import java.util.Scanner;

class Main0805 {

    static int[] pm;
    static int n, m;

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }


    public static void main(String[] args) {
        Main0805 main = new Main0805();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        pm = new int[m];

        main.DFS(0);
    }
}
