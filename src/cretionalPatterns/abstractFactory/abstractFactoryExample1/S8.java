package cretionalPatterns.abstractFactory.abstractFactoryExample1;

public class S8 implements Telefon {

    private String model;

    public S8(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return "S8{" +
                "model='" + model + '\'' +
                '}';
    }
}
