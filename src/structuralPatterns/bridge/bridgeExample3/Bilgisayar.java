package structuralPatterns.bridge.bridgeExample3;

public class Bilgisayar extends MuzikCalabilenCihaz{

    public Bilgisayar(Oynatıcı oynatıcı, MuzikCalar muzikCalar) {
        super(oynatıcı, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Bilgisayar çalıştı");
        super.muzikCal(muzik);
    }
}
