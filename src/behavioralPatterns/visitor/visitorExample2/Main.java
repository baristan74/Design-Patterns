package behavioralPatterns.visitor.visitorExample2;

public class Main {
    public static void main(String[] args) {
        Cihaz telefon = new Telefon("Samsung","S8","Mobil cihaz ile çıktı al");
        Cihaz tablet = new Tablet("Samsung","Galaxy Tablet","Tablet cihaz ile çıktı al");
        Cihaz bilgisayar = new Bilgisayar("Monster","Abra A7","Bilgisayar cihaz ile çıktı al");



        telefon.yazdır(new CannonYazici());
        System.out.println();
        telefon.yazdır(new HpYazici());
        System.out.println();
        tablet.yazdır(new CannonYazici());
        System.out.println();
        tablet.yazdır(new HpYazici());
        System.out.println();
        bilgisayar.yazdır(new CannonYazici());
        System.out.println();
        bilgisayar.yazdır(new HpYazici());
    }

}
