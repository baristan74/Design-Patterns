package creationalPatterns.singleton.threadSafeSingleton;

public class ThreadSafeLazySingletonClient extends Thread{
    public static void main(String[] args) {
        for (int i=0;i<1000;i++){
            new ThreadSafeLazySingletonClient().start();
        }
    }

    public void run(){
        ThreadSafeLazySingleton singleton = ThreadSafeLazySingleton.getInstance();
        singleton.printName();
    }
}
