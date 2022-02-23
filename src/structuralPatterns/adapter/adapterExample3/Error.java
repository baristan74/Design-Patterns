package structuralPatterns.adapter.adapterExample3;

public interface Error {
    int ErrorNumber();
    String description();
    void sendMail();
}
