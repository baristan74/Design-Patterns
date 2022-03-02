package behavioralPatterns.visitor.visitorExample3;

public abstract class Document {


    private String text;

    public abstract void accept(Visitor visitor);

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
