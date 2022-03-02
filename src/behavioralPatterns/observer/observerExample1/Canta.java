package behavioralPatterns.observer.observerExample1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Canta extends Urun {

    private List<Observer> observerList;

    public Canta(String adi, BigDecimal fiyat) {
        super(adi, fiyat);
        observerList = new ArrayList<>();
    }

    @Override
    public void ekle(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void cikar(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void haberVer() {
        for(Observer observer:observerList){
            observer.update(this);
        }
    }

}
