package programmers.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 해시 - 완주하지 못한 선수
 *
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/42576">프로그래머스</a>
 * @since 2021.10.30
 * @author shlee
 */
public class Main01 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String str : participant) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (String key : completion) {
            map.put(key, map.get(key) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main01 main = new Main01();

//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(main.solution(participant, completion));
    }
}
