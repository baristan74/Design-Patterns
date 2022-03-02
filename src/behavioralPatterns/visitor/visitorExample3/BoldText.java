package behavioralPatterns.visitor.visitorExample3;

public class BoldText extends Document {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
