package structuralPatterns.bridge.bridgeExample3;

public class Main {
    public static void main(String[] args) {

        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse gülümse");

        MuzikCalabilenCihaz bilgisayar = new Bilgisayar(new Kulaklik(),new Fizy());

        bilgisayar.muzikCal(muzik);



        MuzikCalabilenCihaz telefon = new Telefon(new Kulaklik(),new Spotify());

        telefon.muzikCal(muzik);
    }
}
