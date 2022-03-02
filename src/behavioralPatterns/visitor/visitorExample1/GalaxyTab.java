package behavioralPatterns.visitor.visitorExample1;

public class GalaxyTab extends Tablet {

    public GalaxyTab(String model, String marka) {
        super(model, marka);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
