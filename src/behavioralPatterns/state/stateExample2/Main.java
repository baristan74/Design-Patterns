package behavioralPatterns.state.stateExample2;

public class Main  {
    public static void main(String[] args) {
        Oyun oyun=new Oyun();
        oyun.xBas();
        oyun.kare();
        oyun.ucgen();
        oyun.yuvarlak();

        oyun.topuKaptir();

        oyun.xBas();
        oyun.kare();
        oyun.ucgen();
        oyun.yuvarlak();

    }
}
