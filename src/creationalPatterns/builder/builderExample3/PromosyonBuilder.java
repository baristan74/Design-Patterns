package creationalPatterns.builder.builderExample3;

public abstract class PromosyonBuilder {

    protected Promosyon promosyon;

    public Promosyon promosyon(){
        return promosyon;
    }

    public abstract void setUrunAdi(String urunAdi);
    public abstract void setPromosyonNumarasi(int promosyonNumarasi);
    public abstract void setCalisanProfili(String calisanProfili);

}
