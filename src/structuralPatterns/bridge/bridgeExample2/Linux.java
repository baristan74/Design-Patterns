package structuralPatterns.bridge.bridgeExample2;

public class Linux extends UI {

    public Linux(Mod mod) {
        super(mod);
    }

    @Override
    public void oluştur() {
        System.out.println("Linux işletim sistemi "+ mod + " da açıldı");
    }



}
