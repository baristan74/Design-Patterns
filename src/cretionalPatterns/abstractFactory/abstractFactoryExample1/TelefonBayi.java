package cretionalPatterns.abstractFactory.abstractFactoryExample1;

public class TelefonBayi {
    public static void main(String[] args) {
        S8Factory s8 = new S8Factory();
        s8.getTelefon("s8");

        Note8Factory note8 = new Note8Factory();
        note8.getTelefon("note8");

        System.out.println(s8);
        System.out.println(note8);
    }
}
