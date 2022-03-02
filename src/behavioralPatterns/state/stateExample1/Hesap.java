package behavioralPatterns.state.stateExample1;

public class Hesap {

    private HesapDurumu hesapDurumu;

    public Hesap(){

        hesapDurumu=new NormalHesap();
    }

    public void faizOde(){
        hesapDurumu.faizOdeme();
    }

    public void paraCek(){
        hesapDurumu.paraCekmek();
    }

    public void durumDegistir(HesapDurumu yeniHesapDurumu){
        hesapDurumu= yeniHesapDurumu;
    }
}
