package structuralPatterns.adapter.adapterExample2;

public class Main {
    public static void main(String[] args) {
        Priz priz = new Priz();

        Utu utu = new Utu();
        Buzdolabı buzdolabı = new Buzdolabı();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabı);

        SamsungTelefon samsungTelefon = new SamsungTelefon();
        TelefonElektrikliEvAletiAdapter adapter = new TelefonElektrikliEvAletiAdapter(samsungTelefon);


        priz.elektrikVer(adapter);
    }
}
