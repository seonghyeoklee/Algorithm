package study.generics;

public class Powder extends Material {
    public String toString() {
        return "material is Powder";
    }

    @Override
    public void doPrinting() {
        System.out.println("Powder");
    }
}
