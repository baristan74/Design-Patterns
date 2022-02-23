package structuralPatterns.adapter.adapterExample3;

public class Main {
    public static void main(String[] args) {
        FaxError fax = new FaxError();

        Error faxError = new FaxAdapter(fax);

        faxError.sendMail();
    }
}
