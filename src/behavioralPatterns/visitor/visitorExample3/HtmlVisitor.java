package behavioralPatterns.visitor.visitorExample3;

public class HtmlVisitor implements Visitor {
    @Override
    public void visit(Document document) {
        System.out.println("Html formatta çıktınız çıkarılmıştır");
    }
}
