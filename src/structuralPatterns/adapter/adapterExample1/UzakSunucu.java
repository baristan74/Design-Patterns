package structuralPatterns.adapter.adapterExample1;

public class UzakSunucu {



    public void uzakHedefeKaydet(String domain,String hedef,String kaynak){
        baglantiKur();
        dosyaGonder(kaynak,domain+hedef); // hedef Stringini domain ve hedef oluşturuyor o sebepten birleştirildi.
        baglantiKapat();
    }

    public void baglantiKur(){
        System.out.println("Bağlantı kuruldu");
    }

    public void baglantiKapat(){
        System.out.println("Bağlantı kapatildi");
    }
    public void dosyaGonder(String kaynak,String hedef){

        System.out.println(kaynak+" tan "+hedef+"'e  yedeklendi" );
    }

}
