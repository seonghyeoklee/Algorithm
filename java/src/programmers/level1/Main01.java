package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 정렬 - K 번째수
 *
 * @author shlee
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/92334">프로그래머스</a>
 * @since 2022.01.23
 */
class Main01 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, Integer> cnt = new HashMap<>();
        HashMap<String, Integer> idx = new HashMap<>();

        Arrays.sort(report);

        String before = "";

        for (int i = 0; i < id_list.length; i++) {
            cnt.put(id_list[i], 0);
            idx.put(id_list[i], i);
        }

        for(String r : report){
            if (before.equals(r)) {
                continue;
            }
            before = r;

            String[] re = r.split(" ");
            cnt.put(re[1], cnt.get(re[1]) + 1);
        }

        before = "";

        for (String r : report) {
            if (before.equals(r)) {
                continue;
            }
            before = r;

            String[] re = r.split(" ");
            if (cnt.get(re[1]) >= k) {
                answer[idx.get(re[0])] += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main01 main = new Main01();

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        System.out.println(Arrays.toString(main.solution(id_list, report, k)));
    }
}
