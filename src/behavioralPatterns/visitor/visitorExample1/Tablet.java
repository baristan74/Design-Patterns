package behavioralPatterns.visitor.visitorExample1;

public abstract class Tablet {
    private String model;
    private String marka;

    public Tablet(String model,String marka){
        this.model=model;
        this.marka=marka;
    }

    public abstract void accept(Visitor visitor);
}
