package structuralPatterns.bridge.bridgeExample1;

public class Kutu extends OluşturulacakNesne {

    public Kutu(Renk renk, Sekil sekil) {
        super(renk, sekil);
    }

    @Override
    public void olustur() {
        System.out.println( "Kutu " + renk.renkGetir() +" renkte ve " +sekil.sekilGetir()+ " şeklinde olusturuldu" );
    }


}
