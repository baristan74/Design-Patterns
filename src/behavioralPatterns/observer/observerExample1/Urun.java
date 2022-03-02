package behavioralPatterns.observer.observerExample1;

import java.math.BigDecimal;

public abstract class Urun {

    private String adi;
    private BigDecimal fiyat;

    public Urun (String adi,BigDecimal fiyat) {
        this.adi = adi;
        this.fiyat = fiyat;
    }

    public abstract void ekle(Observer observer);

    public abstract void cikar(Observer observer);

    public abstract void haberVer();


    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal yeniFiyat) {
        if(fiyat.intValue()>yeniFiyat.intValue()){
            System.out.println("Fiyat Düştü artık "+ adi + " isimli ürün fiyati:" + yeniFiyat);
            haberVer();
        }else{
            System.out.println("Fiyat Çıktı "+ adi + " isimli ürün fiyati:" + yeniFiyat);
            haberVer();
        }
        fiyat = yeniFiyat;
    }

    public String getAdi() {
        return adi;
    }
}
