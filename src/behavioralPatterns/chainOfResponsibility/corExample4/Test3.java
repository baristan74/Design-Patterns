package behavioralPatterns.chainOfResponsibility.corExample4;

public class Test3 extends Yazilim{
    @Override
    public boolean testiKoş(Kod kod) {
        if(kod.getAdim3()){
            System.out.println("3.Test başarılı Kodunuz tüm aşamaları geçti");
            return true;
        }else{
            System.out.println("3.Test başarısız");
            return false;
        }

    }
}
