package behavioralPatterns.observer.observerExample4;

import java.util.ArrayList;
import java.util.List;

public class Ogrenci extends Ogrenciler{

    private List<Ebeveyn> ebeveynList;

    public Ogrenci(String isim, String soyadi) {
        super(isim, soyadi);
        ebeveynList = new ArrayList<>();
    }

    @Override
    public void ebeveynEkle(Ebeveyn ebeveyn) {
        ebeveynList.add(ebeveyn);
    }

    @Override
    public void ebeveynKaldir(Ebeveyn ebeveyn) {
        ebeveynList.remove(ebeveyn);
    }

    @Override
    public void ebeveynHaberVer() {
        for(Ebeveyn ebeveyn: ebeveynList){
            ebeveyn.update(this);
        }
    }

    public void okuldanKac(){
        ebeveynHaberVer();
    }
}
