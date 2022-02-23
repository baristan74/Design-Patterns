package structuralPatterns.bridge.bridgeExample3;

public class Spotify implements MuzikCalar{

    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Spotify " + muzik + " çalıyor");
        return muzik.getSes();
    }
}
