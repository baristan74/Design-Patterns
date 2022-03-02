package behavioralPatterns.visitor.visitorExample1;

public class UcGVisitor implements Visitor{
    @Override
    public void visit(Tablet tablet) {
        if(tablet instanceof Ipad){
            System.out.println("Ipad'in 3g özelliği yok ");
        }else if(tablet instanceof GalaxyTab) {
            System.out.println("GalaxyTab'in 3g özelliği açıldı");
        }else{
            System.out.println("Böyle bir table bulunamadı");
        }
    }
}
