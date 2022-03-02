package behavioralPatterns.visitor.visitorExample1;

public class Main {
    public static void main(String[] args) {
        Ipad ipad = new Ipad("Ipad mini","Apple");
        GalaxyTab galaxyTab= new GalaxyTab("Galaxy Tab", "Samsung");

        ipad.accept(new UcGVisitor());
        galaxyTab.accept(new UcGVisitor());

        ipad.accept(new WifiVisitor());
        galaxyTab.accept(new WifiVisitor());


    }
}
