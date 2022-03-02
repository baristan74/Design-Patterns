package behavioralPatterns.chainOfResponsibility.corExample1;

public class KefilKontrol extends Bankacilik {
    @Override
    public boolean onayVarMı(Musteri musteri) {

        if(musteri.isKefil()){
            System.out.println(musteri.getIsim() + " isimli müşterinin kefili güvenilir");
            return true;
        }else{
            System.out.println(musteri.getIsim() + " isimli müşterinin kefili gevenilir değil");
            return false;
        }
    }
}
