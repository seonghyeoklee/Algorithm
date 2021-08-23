package programmers.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Main02 {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> hashSet = (HashSet<String>) Arrays.stream(phone_book).collect(Collectors.toSet());

        for (String key : hashSet) {
            for (int j = 1; j <= key.length() - 1; j++) {
                if (hashSet.contains(key.substring(0, j))) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main02 main = new Main02();

        String[] phone_book = {"119", "97674223", "1195524421"};
//        String[] phone_book = {"123", "456", "789"};

        System.out.println(main.solution(phone_book));

    }
}
