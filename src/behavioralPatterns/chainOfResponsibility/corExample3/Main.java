package behavioralPatterns.chainOfResponsibility.corExample3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Musteri musteri=new Musteri("Baris",20000);

        List<Banka> izinler=new ArrayList<>();
        izinler.add(new Veznedar());
        izinler.add(new Yonetici());
        izinler.add(new Mudur());
        izinler.add(new BolgeSorumlusu());

        izinler.get(0).sonrakiIzin=izinler.get(1);
        izinler.get(1).sonrakiIzin=izinler.get(2);
        izinler.get(2).sonrakiIzin=izinler.get(3);


        izinler.get(0).onayVarmı(musteri);

    }
}
