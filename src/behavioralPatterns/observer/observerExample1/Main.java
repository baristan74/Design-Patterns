package behavioralPatterns.observer.observerExample1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Uye uye = new Uye("Uye");

        Araba araba = new Araba("Araba", BigDecimal.valueOf(40));
        Araba kalem = new Araba("kalem", BigDecimal.valueOf(50));

        uye.favorilereUrunEkle(kalem);
        uye.favorilereUrunEkle(araba);

        kalem.setFiyat(BigDecimal.ZERO);
        araba.setFiyat(BigDecimal.valueOf(50));


    }
}
