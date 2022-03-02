package behavioralPatterns.strategy.strategyExample1;

public class HaftasonuArayüzü extends Arayüz{
    @Override
    public void arayüzSeç() {
        System.out.println("Hafta sonu arayüzü seçildi");
    }

    @Override
    public int inidirimDeğeri(int fiyat) {
        int indirimlimiktarı= (fiyat/100)*10;
        int indirimliFiyat=fiyat-indirimlimiktarı;
        return indirimliFiyat;
    }
}
