package behavioralPatterns.visitor.visitorExample3;

public class Main {
    public static void main(String[] args) {
        BoldText boldText=new BoldText();
        HyperLink hyperLink=new HyperLink();
        PlainText plainText=new PlainText();

        boldText.setText("Bold türünde text");
        hyperLink.setText("HyperLink türünde text");
        plainText.setText("PlainText türünde text");

        boldText.accept(new HtmlVisitor());
        hyperLink.accept(new HtmlVisitor());
        plainText.accept(new HtmlVisitor());

    }
}
