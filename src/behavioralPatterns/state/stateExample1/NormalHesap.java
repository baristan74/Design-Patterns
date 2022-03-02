package behavioralPatterns.state.stateExample1;

public class NormalHesap implements HesapDurumu{
    @Override
    public void paraCekmek() {
        System.out.println("Para ödendi Normal hesap ile");
    }

    @Override
    public void faizOdeme() {
        System.out.println("Faiz ödendi Normal hesaba göre");

    }
}
