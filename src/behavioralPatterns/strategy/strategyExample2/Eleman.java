package behavioralPatterns.strategy.strategyExample2;

public class Eleman {
    private IzınHesap izinHesap;
    private MaasHesap maasHesap;

    public Eleman(IzınHesap izinHesap, MaasHesap maasHesap){
        this.izinHesap=izinHesap;
        this.maasHesap=maasHesap;
    }

    public int izinHesapla(){
        return izinHesap.izinHesapla();
    }

    public int maasHesapla(){
        return maasHesap.maasHesap();
    }

}
