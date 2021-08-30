package programmers;

public class WeeklyChallenge5 {

    static int count;
    static String[] dic = new String[]{"A", "E", "I", "O", "U"};
    static int[] ch;
    static int n;

    public void DFS(int L) {
        if (L == n + 1) {
            System.out.println(L);
        } else {
            for (int i = 0; i < dic.length; i++) {
                for (int j = 0; j < dic.length; j++) {
                    DFS(L + 1);
                }
            }
        }
    }

    public int solution(String word) {
        int answer = 0;

        ch = new int[n + 1];
        DFS(1);

        return answer;
    }

    public static void main(String[] args) {
        WeeklyChallenge5 weeklyChallenge5 = new WeeklyChallenge5();

        String word = "AAAAE";
//        String word = "I";
//        String word = "EIO";
        n = word.length();

        System.out.println(weeklyChallenge5.solution(word));
    }
}
