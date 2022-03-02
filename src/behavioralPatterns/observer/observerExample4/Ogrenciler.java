package behavioralPatterns.observer.observerExample4;

public abstract class Ogrenciler {
    private String isim;
    private String soyadi;

    public Ogrenciler(String isim,String soyadi){
        this.isim=isim;
        this.soyadi=soyadi;
    }

    public abstract void ebeveynEkle(Ebeveyn ebeveyn);

    public abstract void ebeveynKaldir(Ebeveyn ebeveyn);

    public abstract void ebeveynHaberVer();

    public String getIsim() {
        return isim;
    }
}
