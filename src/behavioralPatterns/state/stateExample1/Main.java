package behavioralPatterns.state.stateExample1;

public class Main {
    public static void main(String[] args) {
        Hesap hesap=new Hesap();

        hesap.paraCek();
        hesap.faizOde();

        hesap.durumDegistir(new AltınHesap());

        hesap.faizOde();
        hesap.paraCek();
    }
}
