package behavioralPatterns.strategy.strategyExample1;

public class YılbasiArayüzü extends Arayüz{

    @Override
    public void arayüzSeç() {
        System.out.println("Yılbaşı arayüzü seçildi");
    }

    @Override
    public int inidirimDeğeri(int fiyat) {
        int indirimlimiktarı= (fiyat/100)*20;
        int indirimliFiyat=fiyat-indirimlimiktarı;
        return indirimliFiyat;
    }
}
