package structuralPatterns.bridge.bridgeExample3;

public class Telefon extends MuzikCalabilenCihaz{
    public Telefon(Oynatıcı oynatıcı, MuzikCalar muzikCalar) {
        super(oynatıcı, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon çalıştı");
        super.muzikCal(muzik);
    }
}
