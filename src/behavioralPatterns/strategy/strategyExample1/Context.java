package behavioralPatterns.strategy.strategyExample1;

public class Context { // Stratejiyi uygulayan sınıf

    private Arayüz arayüz;

    public Context(Arayüz arayüz) {

        this.arayüz = arayüz;
    }

    public void arayüzGetir(){

        arayüz.arayüzSeç();
    }

    public int arayüzİndirimi(int fiyat){

        return arayüz.inidirimDeğeri(fiyat);
    }



}
