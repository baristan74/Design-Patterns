package structuralPatterns.bridge.bridgeExample1;

public abstract class OluşturulacakNesne{

    Renk renk;
    Sekil sekil;

    public OluşturulacakNesne(Renk renk, Sekil sekil) {
        this.renk=renk;
        this.sekil=sekil;
    }

    public abstract void olustur();



}
