package behavioralPatterns.state.stateExample1;

public class AltınHesap implements HesapDurumu{

    @Override
    public void paraCekmek() {
        System.out.println(" Para ödendi Altın Hesabı için");
    }

    @Override
    public void faizOdeme() {
        System.out.println(" Faiz ödendi Altın hesabına göre");
    }
}
