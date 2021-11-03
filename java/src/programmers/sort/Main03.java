package programmers.sort;

/**
 * 정렬 - H-index
 *
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/42747">프로그래머스</a>
 * @since 2021.11.03
 * @author shlee
 */
public class Main03 {
    public int solution(int[] citations) {
        int result = 0;

        for (int i = 0; i < citations.length; i++) {
            int smaller = Math.min(citations[i], citations.length - i);
            result = Math.max(result, smaller);
        }

        return result;
    }

    public static void main(String[] args) {
        Main03 main = new Main03();

        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(main.solution(citations));
    }
}
