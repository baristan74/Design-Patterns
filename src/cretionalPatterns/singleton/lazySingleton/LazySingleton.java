package cretionalPatterns.singleton.lazySingleton;

public class LazySingleton {

    // Eğer bu sınıfa birden fazla thread erişmiyorsa sorunsuz olarak çalışır.
    // Eğer birden fazla thread singleton nesnesinin oluşturulduğu yere aynı anda girerse farklı instance lar oluşur bu da singleton ilkesine aykırıdır.
    private static LazySingleton singleton;

    private LazySingleton (){

    }

    public static LazySingleton getInstance(){
        if(singleton ==null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
