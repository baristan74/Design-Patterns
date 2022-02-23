package structuralPatterns.bridge.bridgeExample1;

public class Main {
    public static void main(String[] args) {
        Kutu kutu = new Kutu(new Kırmızı(), new Daire());
        kutu.olustur();
        Kagit kagit = new Kagit(new Beyaz(),new Kare());
        kagit.olustur();
    }
}