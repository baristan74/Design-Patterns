package structuralPatterns.bridge.bridgeExample1;

public class Beyaz implements Renk {

    String renk = "beyaz";
    @Override
    public String toString() {
        return "beyaz";
    }
    @Override
    public String renkGetir() {
        return renk;
    }
}
