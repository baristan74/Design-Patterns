package behavioralPatterns.chainOfResponsibility.corExample4;

public class Kod {
    private Boolean adim1;
    private Boolean adim2;
    private Boolean adim3;

    public Kod(Boolean adim1,Boolean adim2,Boolean adim3){
        this.adim1=adim1;
        this.adim2=adim2;
        this.adim3=adim3;
    }

    public Boolean getAdim1() {
        return adim1;
    }

    public void setAdim1(Boolean adim1) {
        this.adim1 = adim1;
    }

    public Boolean getAdim2() {
        return adim2;
    }

    public void setAdim2(Boolean adim2) {
        this.adim2 = adim2;
    }

    public Boolean getAdim3() {
        return adim3;
    }

    public void setAdim3(Boolean adim3) {
        this.adim3 = adim3;
    }
}
