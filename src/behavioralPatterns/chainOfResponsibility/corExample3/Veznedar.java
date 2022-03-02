package behavioralPatterns.chainOfResponsibility.corExample3;

public class Veznedar extends Banka {
    @Override
    public void onayVarmı(Musteri musteri) {
        if(musteri.getParaMiktarı()<=4000){
            System.out.println("Veznedar tarafından 4000 Tl para çekildi.");

        }else{
            sonrakiIzin.onayVarmı(musteri);
        }

    }
}
