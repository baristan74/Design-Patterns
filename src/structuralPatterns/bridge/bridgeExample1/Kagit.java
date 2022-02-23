package structuralPatterns.bridge.bridgeExample1;

public class Kagit extends OluşturulacakNesne {

    public Kagit(Renk renk, Sekil sekil) {
        super(renk, sekil);
    }

    @Override
    public void olustur() {
        System.out.println( "Kağıt " + renk.renkGetir()+" renkte ve " + sekil.sekilGetir()+ " şeklinde olusturuldu" );
    }

}
