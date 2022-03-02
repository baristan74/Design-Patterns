package behavioralPatterns.observer.observerExample3;

public class Hasta extends Insan {

    private String name;

    public Hasta(String name){
        this.name=name;
    }


    @Override
    public void bildirimGonder(Tahlil tahlil) {
        System.out.println(name + " kişisinin " + tahlil.getTahlilName()+ "  çıktı");
    }

    public void tahlilVer(Tahlil tahlil){
        tahlil.hastaEkle(this);
    }
}
