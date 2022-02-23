package structuralPatterns.adapter.adapterExample3;

public class FaxAdapter implements Error {

    private FaxError faxError;

    public FaxAdapter(FaxError faxError){
        this.faxError=faxError;
    }

    @Override
    public int ErrorNumber() {
        int faxErrorCode = faxError.getFaxErrorCode();
        return faxErrorCode;
    }

    @Override
    public String description() {
        return faxError.getErrorDescription();
    }

    @Override
    public void sendMail() {
        faxError.get();
    }
}
