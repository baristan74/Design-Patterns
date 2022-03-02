package behavioralPatterns.state.stateExample3;

public class SoketAc implements SoketState{
    @Override
    public void handle(Soket soket) {
        System.out.println("Soket açildi"+ soket.getPort());
        soket.setSoket(new SoketDinle());
    }

}
