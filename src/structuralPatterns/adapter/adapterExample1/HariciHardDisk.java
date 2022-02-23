package structuralPatterns.adapter.adapterExample1;

public class HariciHardDisk implements Yedekleyici{
    @Override
    public void kaydet(String kaynak, String hedef) {
        System.out.println(kaynak+" tan "+hedef+"'e harici hard disk yedeklendi" );
    }
}
