package structuralPatterns.adapter.adapterExample3;

public class ServiceError implements Error {

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
        System.out.println("Service hatasi gönderildi "+ errorNumber + description);
    }
}
