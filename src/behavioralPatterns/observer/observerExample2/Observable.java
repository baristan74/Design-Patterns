package behavioralPatterns.observer.observerExample2;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable { // gözlenen sınıf
    private List<Observer> observerList;

    public Observable(){
        observerList = new ArrayList<>();
    }

    public void ekle(Observer observer){
        observerList.add(observer);
    }

    public void cikar(Observer observer){
        observerList.remove(observer);
    }

    public void haberVer(){
        for(Observer observer: observerList){
            observer.update(this);
        }
    }
}
