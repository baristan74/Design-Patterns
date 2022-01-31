package cretionalPatterns.singleton.doubleCheckedSingleton;

public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton singleton;

    /*valotile içi dolup boşalan bir yapısı vardır
    bir int i sayısı olsun bunu farklı threadlar arttırsın eğer bu
    i sayısını valotile olarak tanımlarsak önce bir thread alır arttırır sonra diğeri alır arttırır
    ama valotile tanımlamazsak aynı anda değer attıracakları için 2 farklı thread 5 i 6 yapar gibi düşünülebilir
    */

    private static int count;
    private String name;

    private DoubleCheckedLockingSingleton(){
        count++;
        name = "DoubleCheckedLockingSingleton" + count;

    }

    public static DoubleCheckedLockingSingleton getInstance(){
        if(singleton ==null){
            synchronized (DoubleCheckedLockingSingleton.class){
                //synchronized Anahtar kelimesi ile Threadler metoda sıra ile girerler ve bir thread metodu bitirmeden diğer thread giremez.
                if(singleton ==null)
                    singleton = new DoubleCheckedLockingSingleton();
            }
        }
        return singleton;
    }
    public void printName(){
        System.out.println(name);
    }

}
