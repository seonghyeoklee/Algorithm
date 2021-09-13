package study.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) {
            return s1;
        } else {
            return s2;
        }
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetins = {"a", "b2", "c34", "d567"};

        System.out.println(Arrays.stream(greetins).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) {
                return s1;
            } else {
                return s2;
            }
        }));

        String str = Arrays.stream(greetins).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
