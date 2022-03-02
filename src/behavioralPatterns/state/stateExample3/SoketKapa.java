package behavioralPatterns.state.stateExample3;

public class SoketKapa implements SoketState{
    @Override
    public void handle(Soket soket) {
        System.out.println("Soket kapandı"+ soket.getPort());
        soket.setSoket(new SoketDinle());
    }
}
