package structuralPatterns.facade.facadeExample2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.krediKullan(new Musteri("Baris","123","123123"), BigDecimal.valueOf(5000));

    }
}
