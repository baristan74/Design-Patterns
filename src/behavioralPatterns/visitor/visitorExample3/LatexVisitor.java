package behavioralPatterns.visitor.visitorExample3;

public class LatexVisitor implements Visitor{
    @Override
    public void visit(Document document) {
        System.out.println("Latex formatta çıktınız hazorlanmıştır");
    }
}
