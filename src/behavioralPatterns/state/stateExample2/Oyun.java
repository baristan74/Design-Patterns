package behavioralPatterns.state.stateExample2;

public class Oyun {
    private Konsol konsol;

    public Oyun() {
        System.out.println("Oyun Başladı");
        konsol = new Hücum();

    }

    public void ucgen(){
        konsol.ucgenBas();
    }

    public void kare(){
        konsol.kareBas();
    }

    public void yuvarlak(){
        konsol.yuvarlakBas();
    }

    public void xBas(){
        konsol.xBas();
    }

    public void topuKap(){
        System.out.println("Top kapıldı. Hücuum");
        konsol = new Hücum();
    }

    public void topuKaptir(){
        System.out.println("Top kaptırıldı. Defans");
        konsol = new Defans();
    }
}
