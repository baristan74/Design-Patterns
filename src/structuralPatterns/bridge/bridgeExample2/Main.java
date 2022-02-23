package structuralPatterns.bridge.bridgeExample2;

public class Main {
    public static void main(String[] args) {

        Linux linux = new Linux(new DarkMod());
        linux.oluştur();
        Windows windows = new Windows(new LightMod());
        windows.oluştur();
    }
}
