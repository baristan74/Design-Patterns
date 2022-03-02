package behavioralPatterns.observer.observerExample3;

public class Main {
    public static void main(String[] args) {
        Hasta baris=new Hasta("Baris");
        Hasta firat=new Hasta("Fırat");

        Tahlil1 idrarTahlili=new Tahlil1("1","idrar tahlili");
        Tahlil1 kanTahlili=new Tahlil1("2","kan tahlili");

        baris.tahlilVer(idrarTahlili);
        firat.tahlilVer(kanTahlili);

        idrarTahlili.tahlilCikti();
        kanTahlili.tahlilCikti();
    }
}
