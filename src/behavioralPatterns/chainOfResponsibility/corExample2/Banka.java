package behavioralPatterns.chainOfResponsibility.corExample2;

public abstract class Banka {

    protected boolean confirmedCredit;
    private Banka nextOperation;

    public void setNext(Banka operation){
        this.nextOperation=operation;
    }

    public void execute(Customer customer){
        executeProcess(customer);
        if(this.nextOperation!=null){
            //her seferinde bir sonrakine geçer
            this.nextOperation.confirmedCredit = this.confirmedCredit;
            // bir sonraki çalışır
            this.nextOperation.execute(customer);
        }
    }

    public abstract void executeProcess(Customer customer);
}
