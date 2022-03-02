package behavioralPatterns.chainOfResponsibility.corExample3;

public class Mudur extends Banka{

    @Override
    public void onayVarmı(Musteri musteri) {
        if(musteri.getParaMiktarı()<=15000){
            System.out.println("Mudur tarafından 15000 Tl para çekildi.");

        }else{
            sonrakiIzin.onayVarmı(musteri);

        }

    }
}
