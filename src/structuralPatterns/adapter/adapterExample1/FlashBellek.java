package structuralPatterns.adapter.adapterExample1;

public class FlashBellek implements Yedekleyici{
    @Override
    public void kaydet(String kaynak, String hedef) {
        System.out.println(kaynak+" tan "+hedef+"'e flash bellek yedeklendi" );
    }
}
