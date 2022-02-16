package creationalPatterns.abstractFactory.abstractFactoryExample2;

public class BMWCar implements Car{

    private String color;
    private double price;

    public BMWCar(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String getColor() {
        return color;
    }


    @Override
    public double getPrice() {
        return price;
    }

}
