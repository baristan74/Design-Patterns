package creationalPatterns.abstractFactory.abstractFactoryExample2;

public class BMWFactory implements AbstractFactory{
    @Override
    public Car createCar(String color, double price) {
        return new BMWCar(color,price);
    }

    @Override
    public MotorCycle createMotorCycle(String type, double price) {
        return new BMWMotorcycle(type,price);
    }
}
