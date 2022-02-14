package cretionalPatterns.abstractFactory.abstractFactoryExample2;

public class BMWMotorcycle implements MotorCycle{

    private String type;
    private double price;

    public BMWMotorcycle(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
