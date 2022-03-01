package structuralPatterns.composite.compositeExample1;

public class Main {
    public static void main(String[] args) {

        Gelistirici gelistirici1 = new Gelistirici(1,"Emirhan");
        Gelistirici gelistirici2 = new Gelistirici(2,"Hüseyin");

        Tasarimci tasarimci1 = new Tasarimci(1,"Batuhan");
        Tasarimci tasarimci2 = new Tasarimci(2,"Muhammed");

        Yonetici yonetici1 = new Yonetici(1,"Barış");
        Yonetici yonetici2 = new Yonetici(2,"Harun");


        yonetici1.ekibeCalisanEkle(tasarimci1);
        yonetici1.ekibeCalisanEkle(gelistirici1);

        yonetici2.ekibeCalisanEkle(tasarimci2);
        yonetici2.ekibeCalisanEkle(gelistirici2);


        yonetici1.ekibeCalisanEkle(yonetici2);

        yonetici1.bilgiGoster();
        System.out.println("*******************************");
        yonetici2.bilgiGoster();



        
    }
}
