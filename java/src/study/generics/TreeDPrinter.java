package study.generics;

public class TreeDPrinter<T extends Material> {
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }
}
