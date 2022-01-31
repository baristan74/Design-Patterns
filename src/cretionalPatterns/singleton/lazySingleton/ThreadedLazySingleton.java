package cretionalPatterns.singleton.lazySingleton;

public class ThreadedLazySingleton {

    private static ThreadedLazySingleton singleton;

    private static int count;
    private String name;

    private ThreadedLazySingleton(){
        count++;
        name= "ThreadedLazySingleton" + count;
    }

    public static ThreadedLazySingleton getInstance(){
        if(singleton == null)
            singleton = new ThreadedLazySingleton();
        return singleton;
    }

    public void printName(){
        System.out.println(name);
    }
}
