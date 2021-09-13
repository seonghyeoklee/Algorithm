package study.lamda;

public class StringConcatTest {
    public static void main(String[] args) {
        StringConcatImpl stringConcat = new StringConcatImpl();
        stringConcat.makeString("hello", "java");

        StringConcat concat = ((s1, s2) -> System.out.println(s1 + " " + s2));
        concat.makeString("hello", "C++");

        StringConcat concat1 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };

        concat1.makeString("hello", "python");
    }
}
