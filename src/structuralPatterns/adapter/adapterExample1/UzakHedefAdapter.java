package structuralPatterns.adapter.adapterExample1;

public class UzakHedefAdapter implements Yedekleyici {

    UzakSunucu uzakSunucu=new UzakSunucu();

    String domain="192.168.1.1";

    @Override
    public void kaydet(String kaynak, String hedef) {

        uzakSunucu.uzakHedefeKaydet(kaynak,hedef,domain);
    }
}
