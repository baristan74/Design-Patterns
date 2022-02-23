package structuralPatterns.bridge.bridgeExample3;

public class Fizy implements MuzikCalar{
    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Fizy " + muzik + " çalıyor");
        return muzik.getSes();
    }
}
