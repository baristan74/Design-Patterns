package structuralPatterns.adapter.adapterExample3;

public class FaxError {

    private int faxErrorCode;
    private String errorDescription;

    void Send(){
        System.out.println("Fax hatası yollandı " + faxErrorCode + errorDescription);
    }

    void get(){
        System.out.println("Fax Hatası gösterildi");
    }

    public int getFaxErrorCode() {
        return faxErrorCode;
    }

    public void setFaxErrorCode(int faxErrorCode) {
        this.faxErrorCode = faxErrorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
