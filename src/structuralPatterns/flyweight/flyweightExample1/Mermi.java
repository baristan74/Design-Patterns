package structuralPatterns.flyweight.flyweightExample1;

public class Mermi {
    private MermiBoyutu mermiBoyutu;

    public Mermi(MermiBoyutu mermiBoyutu) {
        this.mermiBoyutu = mermiBoyutu;
        System.out.println(mermiBoyutu.getBoyut() + " mm mermi oluştu");

        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void atesle(){
        System.out.println("Mermi ateslendi");
    }


}
