package structuralPatterns.facade.facadeExample1;

public class Facade {
    private Ucus ucus;
    private Taksi taksi;
    private Otel otel;

    public Facade(){
        otel=new Otel();
        ucus=new Ucus();
        taksi=new Taksi();
    }

    public void taksiCagir(String sınıf){
        taksi.taksiCağır(sınıf);

    }
    public void otelRezervasyon(String hedefKonum,String sınıf){
        otel.otelRezervasyonu(hedefKonum,sınıf);
    }

    public void ucusRezervasyonu(String baslangıcKonum,String hedefKonum,String sınıf){
        ucus.ucakRezervasyonu(baslangıcKonum,hedefKonum,sınıf);
    }

    public void rezervasyonYap(String taksiSınıf,String hedefKonum,String baslangicKonum,String otelSınıf,String ucusSınıf){
        ucus.ucakRezervasyonu(baslangicKonum,hedefKonum,ucusSınıf);
        otel.otelRezervasyonu(hedefKonum,otelSınıf);
        taksi.taksiCağır(taksiSınıf);
    }

}
