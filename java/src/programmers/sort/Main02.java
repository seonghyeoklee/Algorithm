package programmers.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 정렬 - 가장 큰 수
 *
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/42746">프로그래머스</a>
 * @since 2021.11.03
 * @author shlee
 */
public class Main02 {
    public String solution(int[] numbers) {
        String answer = "";

        List<String> collect = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());

        Collections.sort(collect, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (collect.get(0).equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        collect.stream()
                .forEach(s -> result.append(s));

        answer = result.toString();

        return answer;
    }

    public static void main(String[] args) {
        Main02 main = new Main02();

        int[] numbers = {6, 10, 2};
        System.out.println(main.solution(numbers));
    }
}
