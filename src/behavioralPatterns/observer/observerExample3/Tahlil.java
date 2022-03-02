package behavioralPatterns.observer.observerExample3;

public abstract class Tahlil {

    private String tahlilNo;
    private String tahlilName;

    public Tahlil(String tahlilNo,String tahlilName){
        this.tahlilNo=tahlilNo;
        this.tahlilName=tahlilName;
    }

    public abstract void hastaEkle(Insan insan);
    public abstract void hastaCikar(Insan insan);
    public abstract void haberVer();


    public String getTahlilName() {
        return tahlilName;
    }

}
