package structuralPatterns.bridge.bridgeExample1;

public class Kare implements Sekil {
    String sekil = "kare";
    @Override
    public String toString() {
        return "kare";
    }
    @Override
    public String sekilGetir() {
        return sekil;
    }
}
