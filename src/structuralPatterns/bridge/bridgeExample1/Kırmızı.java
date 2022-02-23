package structuralPatterns.bridge.bridgeExample1;

public class Kırmızı implements Renk{


    String renk = "kırmızı";

    @Override
    public String toString() {
        return "kırmızı";
    }

    @Override
    public String renkGetir() {
        return renk;
    }
}
