package programmers;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;

        for (int i = 1; i <= count; i++) {
            totalPrice += price * i;
        }

        if (money > totalPrice) {
            return 0;
        }

        answer = totalPrice - money;

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Long answer = s.solution(3, 20, 4);

        System.out.println("answer = " + answer);
    }
}