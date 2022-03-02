package behavioralPatterns.chainOfResponsibility.corExample3;

public class Musteri {
    private String name;
    private int paraMiktarı;

    public Musteri(String name, int paraMiktarı) {
        this.name = name;
        this.paraMiktarı = paraMiktarı;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParaMiktarı() {
        return paraMiktarı;
    }

    public void setParaMiktarı(int paraMiktarı) {
        this.paraMiktarı = paraMiktarı;
    }
}
