package cretionalPatterns.factory.factoryExample2;

public class YazmaFabrika {

    public Yazma yazıcı(String type){
        if(type.equals("JSON")){
            return new Json();
        }else if(type.equals("XML")){
            return new XML();
        }else{
            throw new RuntimeException("Geçersiz type");
        }
    }
}
