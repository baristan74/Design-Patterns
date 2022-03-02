package behavioralPatterns.chainOfResponsibility.corExample4;

public class Test2 extends Yazilim{
    @Override
    public boolean testiKoş(Kod kod) {
        if(kod.getAdim2()){
            System.out.println("2. Test başarılı sıra 3. testde");
            sonrakiAdim.testiKoş(kod);
            return true;
        }else{
            System.out.println("2.Test Başarısız");
            return false;
        }
    }
}
