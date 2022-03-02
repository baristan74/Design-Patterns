package behavioralPatterns.chainOfResponsibility.corExample1;

public class OdemeGecikmesiKontrol extends Bankacilik{

    @Override
    public boolean onayVarMı(Musteri musteri) {
        if(musteri.getGecikme()<3){
            System.out.println(musteri.getIsim() + " isimli müşterinin gecikme süresi geçerli");
            return true;
        }else{
            System.out.println(musteri.getIsim() + " isimli müşterinin gecikme süresi geçersiz");
            return false;
        }
    }
}
