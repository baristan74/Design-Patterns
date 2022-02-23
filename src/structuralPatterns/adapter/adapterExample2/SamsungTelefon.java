package structuralPatterns.adapter.adapterExample2;

public class SamsungTelefon implements Telefon {

    private int calismaVoltajı;

    public SamsungTelefon(){
        this.calismaVoltajı = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Samsung Telefon Çalışıyor");
        return calismaVoltajı;
    }
}
