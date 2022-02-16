package creationalPatterns.factory.factoryExample2;

public class OkumaFabrika {

    public Okuma okuyucu(String type){
        if(type.equals("YLSX")){
            return new YLSX();
        }
        else if(type.equals("ODS")){
            return new ODS();
        }
        else {
            throw new RuntimeException("Geçersiz type.");
        }
    }
}
