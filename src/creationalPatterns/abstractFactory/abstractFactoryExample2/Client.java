package creationalPatterns.abstractFactory.abstractFactoryExample2;

public class Client {
    public static void main(String[] args) {
        AbstractFactory audiFactory = new AudiFactory();
        AbstractFactory bmwFactory = new BMWFactory();

        Car audiCar = audiFactory.createCar("Black",500000);
        Car bmwCar = bmwFactory.createCar("White",420000);

        MotorCycle audiMotorCycle= audiFactory.createMotorCycle("Racer",125000);
        MotorCycle bmwMotorCycle= bmwFactory.createMotorCycle("Motorcycle",20000);

    }
}
