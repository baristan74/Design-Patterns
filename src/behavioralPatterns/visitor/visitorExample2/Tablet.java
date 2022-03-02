package behavioralPatterns.visitor.visitorExample2;

public class Tablet extends Cihaz{

    public Tablet(String marka, String model, String metin) {
        super(marka, model, metin);
    }

    @Override
    public void yazdır(Printer printer) {
        printer.yazdir(this);
    }
}
