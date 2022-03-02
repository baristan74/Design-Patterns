package behavioralPatterns.strategy.strategyExample2;

public class Main {
    public static void main(String[] args) {
        Eleman calisan= new Eleman(new ADepartmanIzın(),new YoneticiMaasHesap());

        int yoneticiMaas=calisan.maasHesapla();
        int yoneticiIzın=calisan.izinHesapla();

        calisan= new Eleman(new BDepartmanIzın(),new MuhendisMaasHesap());

        int mühendisMaas=calisan.maasHesapla();
        int mühendisIzın=calisan.izinHesapla();


        System.out.println("Yonetici Maaşi:"+ yoneticiMaas + " Yönetici İzin: "+ yoneticiIzın);
        System.out.println("Muhendis Maaşi:"+ mühendisMaas + " Muhendis İzin: "+ mühendisIzın);

    }
}
