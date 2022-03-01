package structuralPatterns.composite.compositeExample1;

import java.util.ArrayList;
import java.util.List;

public class InsanKaynaklari implements Calisan {

    protected List<Calisan> ekipList;

    public InsanKaynaklari(){

        ekipList = new ArrayList<>();
    }

    public void calisanEkle(Calisan calisan){
        ekipList.add(calisan);
    }

    public void calisanCikar(Calisan calisan){
        ekipList.remove(calisan);
    }

    public void getAllCalisanList(){
        System.out.println("Calisan listesi");
        for (Calisan calisan:ekipList) {
            System.out.println(calisan);
        }
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Calisan listesi");
        for (Calisan calisan:ekipList) {
            System.out.println(calisan);
        }
    }
}
