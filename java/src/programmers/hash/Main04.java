package programmers.hash;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * 해시 - 베스트앨범
 *
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/42579">프로그래머스</a>
 * @since 2021.11.02
 * @author shlee
 */
public class Main04 {
    class Music {
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        AtomicInteger index = new AtomicInteger();

        Arrays.stream(genres).forEach(s -> {
            map.put(s, map.getOrDefault(s, 0) + plays[index.getAndIncrement()]);
        });

        List<String> genresOrdered = new ArrayList<>();
        while (map.size() != 0) {
            int max = Integer.MIN_VALUE;
            String maxKey = "";
            for (String key : map.keySet()) {
                int tmpCnt = map.get(key);
                if (tmpCnt > max) {
                    max = tmpCnt;
                    maxKey = key;
                }
            }
            genresOrdered.add(maxKey);
            map.remove(maxKey);
        }

        List<Music> result = new ArrayList<>();
        for (String genre : genresOrdered) {
            ArrayList<Music> list = new ArrayList<>();

            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(genre)) {
                    list.add(new Music(genre, plays[i], i));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play);

            result.add(list.get(0));
            if (list.size() != 1) {
                result.add(list.get(1));
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i).idx;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main04 main = new Main04();

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(main.solution(genres, plays));
    }
}

