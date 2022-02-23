package structuralPatterns.bridge.bridgeExample3;

public class Kulaklik implements Oynatıcı{
    @Override
    public void sesÇıkar(String ses) {
        System.out.println("Kulaklık ses çıkarıyor -> "+ ses);
    }
}
