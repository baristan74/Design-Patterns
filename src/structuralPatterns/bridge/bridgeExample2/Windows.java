package structuralPatterns.bridge.bridgeExample2;

public class Windows extends UI{

    public Windows(Mod mod) {
        super(mod);
    }

    @Override
    public void oluştur() {
        System.out.println("Windows işletim sistemi "+ mod + " da açıldı");
    }



}
