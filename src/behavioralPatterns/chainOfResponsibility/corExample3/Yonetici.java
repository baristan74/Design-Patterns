package behavioralPatterns.chainOfResponsibility.corExample3;

public class Yonetici extends Banka {
    @Override
    public void onayVarmı(Musteri musteri) {

        if(musteri.getParaMiktarı()<=7000){
            System.out.println("Yonetici tarafından 7000 Tl para çekildi.");

        }else{
            sonrakiIzin.onayVarmı(musteri);
        }

    }
}
