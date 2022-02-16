package creationalPatterns.builder.builderExample3;

public class PromosyonGonder {
    private PromosyonBuilder promosyonBuilder;

    public Promosyon promosyonGonder(String calisanProfili,String urunAdi,int promosyonNumarasi){
        if(calisanProfili.equals("Amir")){
            promosyonBuilder = new AmirlerConcreteBuilder();
        }else if(calisanProfili.equals("Calisan")){
            promosyonBuilder = new CalisanlarConcreteBuilder();
        }
        this.promosyonBuilder.setPromosyonNumarasi(promosyonNumarasi);
        this.promosyonBuilder.setCalisanProfili(calisanProfili);
        this.promosyonBuilder.setUrunAdi(urunAdi);
        return this.promosyonBuilder.promosyon;
    }
}
