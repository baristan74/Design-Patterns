package structuralPatterns.bridge.bridgeExample1;

public class Daire implements Sekil{
    String sekil = "daire";

    @Override
    public String toString() {
        return "daire";
    }

    @Override
    public String sekilGetir() {
        return sekil;
    }
}
