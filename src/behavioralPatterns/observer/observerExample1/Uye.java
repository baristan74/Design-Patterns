package behavioralPatterns.observer.observerExample1;

import java.util.ArrayList;
import java.util.List;

public class Uye implements Observer {
    private String name;

    private List<Urun> urunList;

    public Uye(String name){
        this.name= name;
        urunList= new ArrayList<>();
    }

    @Override
    public void update(Urun urun) {
        System.out.println(name + "isimli üyeye "+urun.getAdi()+" isimli ürünün "+urun.getFiyat()+" olduğunun bildirimi ulaştı");
    }

    @Override
    public void favorilereUrunEkle(Urun urun) {
        urunList.add(urun);
        System.out.println(urun.getAdi() + " İsimli ürün favorilere eklendi");
    }


}
