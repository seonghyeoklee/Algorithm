package study.lamda;

interface PrintString {
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {
        PrintString printString = str -> System.out.println(str);
        printString.showString("test");

        showMyString(printString);
    }

    public static void showMyString(PrintString printString) {
        printString.showString("test2");
    }
}
