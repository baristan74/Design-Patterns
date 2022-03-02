package behavioralPatterns.chainOfResponsibility.corExample1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Bankacilik> krediOperasyonlari = new ArrayList<>();

        krediOperasyonlari.add(new KrediSkorKontrol());
        krediOperasyonlari.add(new OdemeGecikmesiKontrol());
        krediOperasyonlari.add(new KefilKontrol());
        krediOperasyonlari.add(new MaasKontrol());

        Musteri musteri = new Musteri("Baris",1600,2,true,8000);

        for (int i =0; i<krediOperasyonlari.size()-1;i++){
            krediOperasyonlari.get(i).sonrakiOperasyonaGec(krediOperasyonlari.get(i+1));
        }

        boolean krediOnayi = krediOperasyonlari.get(0).icraEt(musteri);


        if(krediOnayi){
            System.out.println("kredi isteği onaylandi");
        }else{
            System.out.println("Kredi isteği onaylanmadi");
        }




    }
}
