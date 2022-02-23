package structuralPatterns.bridge.bridgeExample3;

public class Hoparlör implements Oynatıcı{
    @Override
    public void sesÇıkar(String ses) {
        System.out.println("Hoparlör ses çikariyor -> " + ses);
    }
}
