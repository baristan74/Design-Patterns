package behavioralPatterns.chainOfResponsibility.corExample1;

public class Musteri {
    private String isim;
    private int skor;
    private int gecikme;
    private boolean kefil;
    private int maaş;

    public Musteri(String isim, int skor, int gecikme, boolean kefil, int maaş) {
        this.isim = isim;
        this.skor = skor;
        this.gecikme = gecikme;
        this.kefil = kefil;
        this.maaş = maaş;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int getGecikme() {
        return gecikme;
    }

    public void setGecikme(int gecikme) {
        this.gecikme = gecikme;
    }

    public boolean isKefil() {
        return kefil;
    }

    public void setKefil(boolean kefil) {
        this.kefil = kefil;
    }

    public int getMaaş() {
        return maaş;
    }

    public void setMaaş(int maaş) {
        this.maaş = maaş;
    }
}
