package structuralPatterns.flyweight.flyweightExample1;

import java.util.LinkedHashMap;
import java.util.Map;

public class MermiFactory {

    private static Map<MermiBoyutu, Mermi> mermiHavuz = new LinkedHashMap<>();

    public static Mermi mermiUret(MermiBoyutu mermiBoyutu){

        Mermi mermi = mermiHavuz.get(mermiBoyutu);

        if(mermi ==null){
            mermi = new Mermi(mermiBoyutu);
            mermiHavuz.put(mermiBoyutu,mermi);
        }

        return mermi;
    }
}
