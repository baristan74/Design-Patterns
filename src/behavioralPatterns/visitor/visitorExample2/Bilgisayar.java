package behavioralPatterns.visitor.visitorExample2;

public class Bilgisayar extends Cihaz{

    public Bilgisayar(String marka, String model, String metin) {
        super(marka, model, metin);
    }

    @Override
    public void yazdır(Printer printer) {
        printer.yazdir(this);
    }
}
