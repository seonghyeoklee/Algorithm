package programmers.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 힙(heap) - 더 맵게
 *
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/42626">프로그래머스</a>
 * @since 2022.01.22
 * @author shlee
 */
public class Main01 {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        Arrays.stream(scoville)
                .forEach(heap::add);

        while (heap.peek() < K) {
            if (heap.size() < 2) {
                return -1;
            }

            Integer p1 = heap.poll();
            Integer p2 = heap.poll();

            heap.add(p1 + (p2 * 2));

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main01 main = new Main01();

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;

        System.out.println(main.solution(scoville, k));
    }
}
