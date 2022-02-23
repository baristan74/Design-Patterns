package structuralPatterns.adapter.adapterExample3;

public class DbError implements Error {

    private int errorNumber;
    private String description;

    @Override
    public int ErrorNumber() {
        return errorNumber;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public void sendMail() {
        System.out.println("Db hatası gönderildi "+ errorNumber + description);
    }
}
