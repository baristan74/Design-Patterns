package creationalPatterns.factory.factoryExample4;

public class TelefonFactory {

    public static Telefon getTelefon(String model, String batarya, int en, int boy){

        if("S8".equalsIgnoreCase(model)){
            return new S8(model,batarya,en,boy);

        }else if("Note8".equalsIgnoreCase(model)){
            return new Note8(model,batarya,en,boy);
        }
        return null;
    }
}
