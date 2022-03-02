package behavioralPatterns.visitor.visitorExample3;

public class PlainText extends Document{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
