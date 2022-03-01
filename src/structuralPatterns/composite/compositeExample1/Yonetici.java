package structuralPatterns.composite.compositeExample1;

import java.util.ArrayList;
import java.util.List;

public class Yonetici implements Calisan {

    private int id;
    private String name;

    private List<Calisan> ekipList= new ArrayList<>();

    public Yonetici(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void ekibeCalisanEkle(Calisan calisan){
        ekipList.add(calisan);
    }

    public void ekiptenCalisanCikar(Calisan calisan){
        ekipList.remove(calisan);
    }


    @Override
    public void bilgiGoster() {
        System.out.println("Yönetici İsim :"+ name);
        for (Calisan calisan: ekipList) {
            calisan.bilgiGoster();
        }
    }
}
