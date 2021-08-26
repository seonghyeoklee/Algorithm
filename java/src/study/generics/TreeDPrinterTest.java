package study.generics;

public class TreeDPrinterTest {
    public static void main(String[] args) {
        TreeDPrinter<Powder> printer1 = new TreeDPrinter<>();
        printer1.setMaterial(new Powder());

        System.out.println(printer1);    //material is Powder

        TreeDPrinter<Plastic> printer2 = new TreeDPrinter<>();
        printer2.setMaterial(new Plastic());

        System.out.println(printer2);   //material is Plastic

        printer1.printing();

//        TreeDPrinter<Water> printer3 = new TreeDPrinter<>();
//        printer3.setMaterial(new Water());
//
//        System.out.println(printer3);   //material is Water
    }
}
