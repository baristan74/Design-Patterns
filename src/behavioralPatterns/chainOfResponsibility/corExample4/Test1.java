package behavioralPatterns.chainOfResponsibility.corExample4;

public class Test1 extends Yazilim{
    @Override
    public boolean testiKoş(Kod kod) {
        if(kod.getAdim1()){
            System.out.println("1. Test Başarılı sıra 2.Test'de");
            sonrakiAdim.testiKoş(kod);
            return true;
        }else{
            System.out.println("1.Test başarısız");
            return false;
        }
    }
}
