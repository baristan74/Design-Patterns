package creationalPatterns.abstractFactory.abstractFactoryExample1;

public class Note8 implements Telefon {

    private String model;

    public Note8(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return "Note8{" +
                "model='" + model + '\'' +
                '}';
    }
}
