package inflearn.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main0804 {

    static int n, m;

    public int BFS(int[] arr) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(0);
        int L = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();

                for (int j = 0; j < arr.length; j++) {
                    int nx = x + arr[j];
                    if (nx == m) {
                        return L + 1;
                    } else {
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Main0804 main = new Main0804();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();

        System.out.println(main.BFS(arr));
    }
}
