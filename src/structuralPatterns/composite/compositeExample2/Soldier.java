package structuralPatterns.composite.compositeExample2;

public abstract class Soldier {
    protected  String name;
    protected Rank rank;

    public Soldier(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }


    public abstract void ExecuteOrder();
}
