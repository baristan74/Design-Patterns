package structuralPatterns.composite.compositeExample1;

public class Gelistirici extends AbstractCalisan {

    public Gelistirici(int id, String isim) {

        super(id, isim);
    }

    @Override
    public String toString() {
        return getIsim();
    }

    @Override
    public void bilgiGoster() {
        System.out.println(getIsim()+" isimli gelistirici id si " + getId());
    }
}
