package cretionalPatterns.factory.factoryExample4;

public class TelefonBayi {
    public static void main(String[] args) {
        Telefon s8 = TelefonFactory.getTelefon("S8", "2600mh", 4, 7);

        Telefon note8 = TelefonFactory.getTelefon("Note8", "3000mh", 7, 10);

        System.out.println("s8 için telefon özellikleri");
        System.out.println(s8);
        System.out.println("note8 için telefdon özellikleri");
        System.out.println(note8);
    }
}
