package behavioralPatterns.visitor.visitorExample1;

public class Ipad extends Tablet{

    public Ipad(String model, String marka) {
        super(model, marka);
    }

    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }
}
