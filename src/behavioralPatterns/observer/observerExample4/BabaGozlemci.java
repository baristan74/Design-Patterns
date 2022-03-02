package behavioralPatterns.observer.observerExample4;

public class BabaGozlemci implements Ebeveyn{

    @Override
    public void update(Ogrenci ogrenci) {
        System.out.println(ogrenci.getIsim() + " isimli oğlunuz okuldan kaçtı");
    }
}
