package inflearn.dfs;

import java.util.Scanner;

class Main0806 {

    static int[] pm, ch, arr;
    static int n, m;

    public void DFS(int L) {
        if (L == m) {
            for (int i = 0; i < pm.length; i++) {
                System.out.print(pm[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0;
                }

            }
        }
    }

    public static void main(String[] args) {
        Main0806 main = new Main0806();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ch = new int[n];
        pm = new int[m];

        main.DFS(0);
    }
}
