package behavioralPatterns.state.stateExample3;

public class SoketDinle implements SoketState {
    @Override
    public void handle(Soket soket) {
        System.out.println("Soket dinleniyor"+ soket.getPort());
        soket.setSoket(new SoketKapa());
    }
}
