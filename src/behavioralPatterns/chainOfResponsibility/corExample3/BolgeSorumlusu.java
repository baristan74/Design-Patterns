package behavioralPatterns.chainOfResponsibility.corExample3;

public class BolgeSorumlusu extends Banka {

    @Override
    public void onayVarmı(Musteri musteri) {
        if(musteri.getParaMiktarı()<=30000){
            System.out.println("Bolge Sorumlusu tarafından 30000 Tl para çekildi.");

        }else{
            System.out.println("Malesef size bu miktarda para veremiyoruz");
        }

    }
}
