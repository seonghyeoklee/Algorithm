package study.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s));

        list.stream().sorted().forEach(s -> System.out.println(s));
    }
}
