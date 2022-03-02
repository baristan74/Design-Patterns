package behavioralPatterns.chainOfResponsibility.corExample4;

public abstract class Yazilim {
    protected Yazilim sonrakiAdim;

    public void setNextText(Yazilim yazilim){
        this.sonrakiAdim=yazilim;
    }

    public abstract boolean testiKoş(Kod kod);



}
