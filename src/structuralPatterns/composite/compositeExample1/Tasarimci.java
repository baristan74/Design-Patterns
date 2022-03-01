package structuralPatterns.composite.compositeExample1;

public class Tasarimci extends AbstractCalisan {

    public Tasarimci(int id, String isim) {
        super(id, isim);
    }

    @Override
    public String toString() {
        return getIsim();
    }

    @Override
    public void bilgiGoster() {
        System.out.println(getIsim()+" isimli tasarimci id si  "+ getId());
    }
}
