package behavioralPatterns.chainOfResponsibility.corExample4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Yazilim> testler=new ArrayList<>();

        testler.add(new Test1());
        testler.add(new Test2());
        testler.add(new Test3());

        for(int i=0;i<testler.size()-1;i++){
            testler.get(i).setNextText(testler.get(i+1));
        }

        Kod kod= new Kod(false,true,true);

        testler.get(0).testiKoş(kod);
    }
}
