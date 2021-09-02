package inflearn.dfs;

import java.util.Scanner;

class Main0807 {

    static int[] combi;
    static int n, m;

    public void DFS(int L, int s) {
        if (L == m) {
            for (int i = 0; i < combi.length; i++) {
                System.out.print(combi[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main0807 main = new Main0807();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];

        main.DFS(0, 1);
    }
}
