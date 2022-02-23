package structuralPatterns.bridge.bridgeExample2;

public class LightMod implements Mod {

    String mod = "Light Mod";

    @Override
    public String toString() {
        return mod;
    }

    @Override
    public String modGetir() {
        return mod;
    }
}
