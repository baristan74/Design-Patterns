package creationalPatterns.builder.builderExample3;

public class CalisanlarConcreteBuilder extends PromosyonBuilder{
    @Override
    public void setUrunAdi(String urunAdi) {
        promosyon.setUrunAdi(urunAdi);
    }

    @Override
    public void setPromosyonNumarasi(int promosyonNumarasi) {
        promosyon.setPromosyonNumarasi(promosyonNumarasi);
    }

    @Override
    public void setCalisanProfili(String calisanProfili) {
        promosyon.setCalisanProfili(calisanProfili);
    }
}
