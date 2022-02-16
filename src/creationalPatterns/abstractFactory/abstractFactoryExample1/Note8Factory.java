package creationalPatterns.abstractFactory.abstractFactoryExample1;

public class Note8Factory implements TelefonFactory{
    @Override
    public Telefon getTelefon(String model) {
        return new Note8(model);
    }
}
