package behavioralPatterns.visitor.visitorExample2;

public abstract class Cihaz {
    private String marka;
    private String model;
    private String metin;

    public Cihaz(String marka,String model,String metin){
        this.marka=marka;
        this.model=model;
        this.metin=metin;
    }


    public abstract void yazdır(Printer printer); // yazdır değil accept veya özellik kazandır da diyebiliriz


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMetin() {
        return metin;
    }

    public void setMetin(String metin) {
        this.metin = metin;
    }
}
