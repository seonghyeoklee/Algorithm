package inflearn.search;

import java.util.Arrays;
import java.util.Scanner;

class Main0609 {
    public static int count(int mid, int[] arr) {
        int cnt = 1;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (total + arr[i] > mid) {
                cnt++;
                total = arr[i];
            } else {
                total += arr[i];
            }
        }

        return cnt;
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (m >= count(mid, arr)) {
                rt = mid - 1;
                answer = mid;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
