package behavioralPatterns.chainOfResponsibility.corExample3;

public abstract class Banka {
    protected Banka sonrakiIzin;

    public abstract void onayVarmÄ±(Musteri musteri);

}
