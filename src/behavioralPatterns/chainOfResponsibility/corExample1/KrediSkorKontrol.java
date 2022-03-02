package behavioralPatterns.chainOfResponsibility.corExample1;

public class KrediSkorKontrol extends Bankacilik{

    @Override
    public boolean onayVarMı(Musteri musteri) {

        if(musteri.getSkor()>1500){
            System.out.println(musteri.getIsim() + " isimli müşterinin kredi skoru yeterli");
            return true;

        }else{
            System.out.println(musteri.getIsim() + " isimli müşterinin kredi skoru yetersiz");
            return false;
        }
    }
}
