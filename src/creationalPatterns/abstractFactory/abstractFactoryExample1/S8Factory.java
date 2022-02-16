package creationalPatterns.abstractFactory.abstractFactoryExample1;

public class S8Factory implements TelefonFactory{

    @Override
    public Telefon getTelefon(String model) {

        return new S8(model);
    }
}
