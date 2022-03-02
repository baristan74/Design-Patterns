package behavioralPatterns.chainOfResponsibility.corExample1;

public class MaasKontrol extends Bankacilik{

    @Override
    public boolean onayVarMı(Musteri musteri) {
        if(musteri.getMaaş()>5000){
            System.out.println(musteri.getIsim() + " isimli müşterinin maaşı yeterli");
            return true;
        }
        else{
            System.out.println(musteri.getIsim() + " isimli müşterinin maaşı yetersiz");
            return false;
        }
    }
}
