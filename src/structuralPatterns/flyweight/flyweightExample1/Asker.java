package structuralPatterns.flyweight.flyweightExample1;

public abstract class Asker {

    private MermiBoyutu mermiBoyutu;

    public Asker(MermiBoyutu mermiBoyutu) {
        this.mermiBoyutu = mermiBoyutu;
    }

    public void atesEt(){
        Mermi mermi = MermiFactory.mermiUret(mermiBoyutu);
        mermi.atesle();
    }

    public void tara(){
        for(int i=0;i<5;i++){
            atesEt();
        }
    }
}
