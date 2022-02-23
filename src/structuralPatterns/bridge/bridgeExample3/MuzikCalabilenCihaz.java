package structuralPatterns.bridge.bridgeExample3;

public abstract class MuzikCalabilenCihaz {
    Oynatıcı oynatıcı;
    MuzikCalar muzikCalar;

    public MuzikCalabilenCihaz(Oynatıcı oynatıcı, MuzikCalar muzikCalar){
        this.muzikCalar=muzikCalar;
        this.oynatıcı= oynatıcı;
    }

    public void muzikCal(Muzik muzik){
        String ses = muzikCalar.muzikCal(muzik);
        oynatıcı.sesÇıkar(ses);
    }

    public Oynatıcı getOynatıcı() {
        return oynatıcı;
    }

    public void setOynatıcı(Oynatıcı oynatıcı) {
        this.oynatıcı = oynatıcı;
    }

    public MuzikCalar getMuzikCalar() {
        return muzikCalar;
    }

    public void setMuzikCalar(MuzikCalar muzikCalar) {
        this.muzikCalar = muzikCalar;
    }
}
