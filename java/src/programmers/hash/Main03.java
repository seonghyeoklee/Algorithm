package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 해시 - 위장
 *
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/42578">프로그래머스</a>
 * @since 2021.10.30
 * @author shlee
 */

/**
 *  3 * 2 -1
 */
public class Main03 {
    public int solution(String[][] clothes) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(clothes).forEach(clothe -> map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1));

        if (map.size() > 1) {
            int count = 1;
            for (String key : map.keySet()) {
                count *= map.get(key) + 1;
            }
            answer = count - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main03 main = new Main03();

        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(main.solution(clothes));

    }
}
