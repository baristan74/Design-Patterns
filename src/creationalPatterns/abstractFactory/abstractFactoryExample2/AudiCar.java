package creationalPatterns.abstractFactory.abstractFactoryExample2;

public class AudiCar implements Car{
    private String color;
    private double price;

    public AudiCar(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

}
