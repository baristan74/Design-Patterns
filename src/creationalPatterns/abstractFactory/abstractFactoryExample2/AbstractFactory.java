package creationalPatterns.abstractFactory.abstractFactoryExample2;

public interface AbstractFactory {
    Car createCar(String color,double price);
    MotorCycle createMotorCycle(String type,double price);

}
