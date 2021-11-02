package programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 정렬 - K 번째수
 *
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/42748">프로그래머스</a>
 * @since 2021.11.03
 * @author shlee
 */
public class Main01 {
    class Command {
        int i, j, k;

        public Command(int[] commands) {
            this.i = commands[0];
            this.j = commands[1];
            this.k = commands[2];
        }

        @Override
        public String toString() {
            return "Command{" +
                    "i=" + i +
                    ", j=" + j +
                    ", k=" + k +
                    '}';
        }
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        List<Command> commandList = Arrays.stream(commands)
                .map(Command::new)
                .collect(Collectors.toList());


        for (int i = 0; i < commandList.size(); i++) {
            Command command = commandList.get(i);

            List<Integer> newList = new ArrayList<>();
            for (int j = command.i - 1; j < command.j; j++) {
                newList.add(array[j]);
            }

            Collections.sort(newList);

            answer[i] = newList.get(command.k - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main01 main = new Main01();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(main.solution(array, commands));
    }
}
