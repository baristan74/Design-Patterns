package structuralPatterns.composite.compositeExample2;

public class PrimitiveSoldier extends Soldier{

    public PrimitiveSoldier(String name, Rank rank) {
        super(name, rank);
    }

    @Override
    public void ExecuteOrder() {

        System.out.println("Rank : "+ rank+ "Name : "+ name);
    }
}
