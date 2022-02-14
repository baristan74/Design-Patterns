package structuralPatterns.facade.facadeExample2;

public class Musteri {
    private String adi;
    private String yasi;
    private String tcNo;

    public Musteri(String adi, String yasi, String tcNo) {
        this.adi = adi;
        this.yasi = yasi;
        this.tcNo = tcNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYasi() {
        return yasi;
    }

    public void setYasi(String yasi) {
        this.yasi = yasi;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }
}
