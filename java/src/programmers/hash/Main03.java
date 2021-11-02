package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 해시 - 위장
 *
 * 경우의 수를 저장 (옷의 종류별로 카운트 + 옷을 입지 않을 경우)
 * 모두 옷을 입지 않을 경우(1) 제외
 *
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/42578">프로그래머스</a>
 * @since 2021.10.30
 * @author shlee
 */
public class Main03 {
    public int solution(String[][] clothes) {
        int answer = clothes.length;

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
