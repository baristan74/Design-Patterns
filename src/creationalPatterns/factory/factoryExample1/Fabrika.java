package creationalPatterns.factory.factoryExample1;

public class Fabrika {

    public Compressing dosyaTipi(String str){
        if(str.equals("rar")){
            return new Rar();
        }else if(str.equals("zip")){
            return new Zip();
        }else if(str.equals("tar")){
            return new Tar();
        }
        else throw new RuntimeException("Geçerli dosya bulunamadı.");
    }
}
