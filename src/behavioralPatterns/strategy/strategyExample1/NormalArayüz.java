package behavioralPatterns.strategy.strategyExample1;

public class NormalArayüz extends Arayüz{
    @Override
    public void arayüzSeç() {
        System.out.println("Normal arayüz seçildi");
    }

    @Override
    public int inidirimDeğeri(int fiyat) {

        return fiyat;
    }
}
