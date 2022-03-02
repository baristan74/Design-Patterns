package behavioralPatterns.observer.observerExample3;

import java.util.ArrayList;
import java.util.List;

public class Tahlil1 extends Tahlil{

    List<Insan> hastaList=new ArrayList<>();

    public Tahlil1(String tahlilNo, String tahlilName) {
        super(tahlilNo, tahlilName);
    }

    @Override
    public void hastaEkle(Insan insan) {
        hastaList.add(insan);
    }

    @Override
    public void hastaCikar(Insan insan) {
        hastaList.remove(insan);
    }

    @Override
    public void haberVer() {
        for(Insan insan:hastaList){
            insan.bildirimGonder(this);
        }
    }

    public void tahlilCikti(){
        haberVer();
    }
}
