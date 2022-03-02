package behavioralPatterns.observer.observerExample4;

public class Main {
    public static void main(String[] args) {
        Ogrenci baris = new Ogrenci("Baris","Tan");

        Ebeveyn baba = new BabaGozlemci();

        baris.ebeveynEkle(baba);
        baris.okuldanKac();

    }
}
