package structuralPatterns.facade.facadeExample2;

import java.math.BigDecimal;

public class Facade {

    private Banka banka;
    private Kredi kredi;
    private MerkezBanka merkezBanka;

    public Facade() {
        banka= new Banka();
        kredi= new Kredi();
        merkezBanka = new MerkezBanka();
    }

    public void krediKullan(Musteri m, BigDecimal talep){

        if(!merkezBanka.karaListeKontrolü(m.getTcNo()) && kredi.krediyiKullanmaDurumu(m)){
            banka.KredidiyiKullan(m,talep);
            System.out.println("Krediyi kullandik");
        }

    }
}
