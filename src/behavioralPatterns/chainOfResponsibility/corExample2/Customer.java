package behavioralPatterns.chainOfResponsibility.corExample2;

public class Customer {
    private int id;
    private String tcKimlik;
    private String name;
    private int kbbScore;
    private boolean guarantorIsFine;
    private int aylikKazanç;

    public Customer(int id, String tcKimlik, String name, int kbbScore, boolean guarantorIsFine, int aylikKazanç) {
        this.id = id;
        this.tcKimlik = tcKimlik;
        this.name = name;
        this.kbbScore = kbbScore;
        this.guarantorIsFine = guarantorIsFine;
        this.aylikKazanç = aylikKazanç;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKbbScore() {
        return kbbScore;
    }

    public void setKbbScore(int kbbScore) {
        this.kbbScore = kbbScore;
    }

    public boolean isGuarantorIsFine() {
        return guarantorIsFine;
    }

    public void setGuarantorIsFine(boolean guarantorIsFine) {
        this.guarantorIsFine = guarantorIsFine;
    }

    public int getAylikKazanç() {
        return aylikKazanç;
    }

    public void setAylikKazanç(int aylikKazanç) {
        this.aylikKazanç = aylikKazanç;
    }
}

