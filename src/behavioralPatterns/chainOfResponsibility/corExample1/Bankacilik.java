package behavioralPatterns.chainOfResponsibility.corExample1;

public abstract class Bankacilik {

    private boolean krediOnayi;
    private Bankacilik sonrakiOperasyon;

    public void sonrakiOperasyonaGec(Bankacilik operasyon){
        this.sonrakiOperasyon = operasyon;
    }

    public abstract boolean onayVarMı(Musteri musteri);

    public boolean icraEt(Musteri musteri){
        if(onayVarMı(musteri)){
            if(sonrakiOperasyon != null){
                return sonrakiOperasyon.onayVarMı(musteri);
            }
            return true;
        }
        return false;
    }
}
