package cretionalPatterns.singleton.threadSafeSingleton;

public class ThreadSafeSingleton {

    //valotile içi dolup boşalan bir yapıya sahiptir.
    private static volatile ThreadSafeSingleton singleton;

    private ThreadSafeSingleton(){

    }

    public static ThreadSafeSingleton getInstance(){
        //synchronized Anahtar kelimesi ile Threadler metoda sıra ile girerler ve bir thread metodu bitirmeden diğer thread giremez.
        synchronized (ThreadSafeSingleton.class){
            if(singleton ==null)
                singleton = new ThreadSafeSingleton();
        }
        return singleton;
    }



}
