package behavioralPatterns.visitor.visitorExample1;

public class WifiVisitor implements Visitor{
    @Override
    public void visit(Tablet tablet) {
        if(tablet instanceof Ipad){
            System.out.println("Ipad' in wifi is açıldı");
        }else if(tablet instanceof GalaxyTab){
            System.out.println("GalaxyTab' in wifi özelliği yok");
        }
        else{
            System.out.println("Böyle bir tablet bulunamadı");
        }
    }
}
