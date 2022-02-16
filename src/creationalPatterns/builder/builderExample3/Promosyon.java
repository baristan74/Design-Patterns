package creationalPatterns.builder.builderExample3;

public class Promosyon {
    public String urunAdi;
    public int promosyonNumarasi;
    private String calisanProfili;

    public Promosyon(){

    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getPromosyonNumarasi() {
        return promosyonNumarasi;
    }

    public void setPromosyonNumarasi(int promosyonNumarasi) {
        this.promosyonNumarasi = promosyonNumarasi;
    }

    public String getCalisanProfili() {
        return calisanProfili;
    }

    public void setCalisanProfili(String calisanProfili) {
        this.calisanProfili = calisanProfili;
    }
}
