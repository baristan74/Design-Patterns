package behavioralPatterns.chainOfResponsibility.corExample1;

public abstract class Bankacilik {

    private boolean krediOnayi;
    private Bankacilik sonrakiOperasyon;

    public void sonrakiOperasyonaGec(Bankacilik operasyon){
        this.sonrakiOperasyon = operasyon;
    }

    public abstract boolean onayVarMÄ±(Musteri musteri);

    public boolean icraEt(Musteri musteri){
        if(onayVarMÄ±(musteri)){
            if(sonrakiOperasyon != null){
                return sonrakiOperasyon.onayVarMÄ±(musteri);
            }
            return true;
        }
        return false;
    }
}
