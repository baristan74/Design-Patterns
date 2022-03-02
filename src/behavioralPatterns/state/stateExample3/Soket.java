package behavioralPatterns.state.stateExample3;

public class Soket {

    private int port;
    private SoketState state;

    public Soket(int port){
        this.port=port;
        state=new SoketAc();
    }

    public void stateDegistir(){
        state.handle(this);
    }



    public int getPort() {
        return port;
    }

    public void setSoket(SoketState state) {
        this.state = state;
    }
}
