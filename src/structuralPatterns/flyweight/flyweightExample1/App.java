package structuralPatterns.flyweight.flyweightExample1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Asker> askerList = new ArrayList<>();

        Yuzbasi yüzbasi = new Yuzbasi();
        askerList.add(yüzbasi);

        for(int i=0;i<50;i++){
            Er er = new Er();
            askerList.add(er);
        }

        for(Asker asker : askerList){
            asker.atesEt();
        }

    }
}
