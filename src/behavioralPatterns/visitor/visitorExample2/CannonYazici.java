package behavioralPatterns.visitor.visitorExample2;

public class CannonYazici implements Printer {

    @Override
    public void yazdir(Cihaz cihaz) {
        System.out.println("Yazici marka: Cannon");
        System.out.println(cihaz.getMetin() + " metni yazdırıldı");
        System.out.println(cihaz.getMarka() +" marksına sahip ve "+cihaz.getModel() + " modeline sahip cihaz ile yazdırma işlemi gerçekleştirildi");
    }
}
