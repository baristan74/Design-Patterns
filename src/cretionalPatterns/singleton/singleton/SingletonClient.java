package cretionalPatterns.singleton.singleton;

public class SingletonClient {
    public static void main(String[] args) {

        for(int i =0; i<1000; i++){
            Singleton singleton = Singleton.getInstance();
            singleton.printName();
        }

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(" HashCode: " + singleton1.hashCode());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(" HashCode: " + singleton2.hashCode());

        if(singleton1==singleton2){
            System.out.println("Nesneler aynı");
        }else{
            System.out.println(" Nesneler farklı");
        }

    }

}
