package structuralPatterns.bridge.bridgeExample2;

public class DarkMod implements Mod {

    String mod = "Darkmod";

    @Override
    public String toString() {
        return mod;
    }

    @Override
    public String modGetir() {
        return mod;
    }
}
