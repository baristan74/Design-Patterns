package behavioralPatterns.state.stateExample2;

public class Hücum implements Konsol{
    @Override
    public void kareBas() {
        System.out.println("Şut Çek");
    }

    @Override
    public void ucgenBas() {
        System.out.println("Ara pas ver");
    }

    @Override
    public void yuvarlakBas() {
        System.out.println("Orta açıyor");
    }

    @Override
    public void xBas() {
        System.out.println("Kısa pas veriyor");
    }
}
