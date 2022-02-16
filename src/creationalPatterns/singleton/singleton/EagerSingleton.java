package creationalPatterns.singleton.singleton;

public class EagerSingleton {
    // singleton nesnesi sınıf yaratıldığında oluşturulur. (Eager)
    private static EagerSingleton singleton = new EagerSingleton();

     private EagerSingleton(){

     }

    public static EagerSingleton getInstance(){
         return singleton;
    }

}
