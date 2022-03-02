package behavioralPatterns.chainOfResponsibility.corExample2;

public class CheckKbbScore extends Banka {
    @Override
    public void executeProcess(Customer customer) {

        if(super.confirmedCredit){

            if(customer.getKbbScore()>1000){
                System.out.println("Müşterinin kbb skoru 1000 den yüksek olduğu için kredi verilebilir");
                super.confirmedCredit=true;
            }else{
                System.out.println("Müşterinin kbb skoru 1000 den düşük olduğu için kredi verilemez !!");
                super.confirmedCredit=false;
            }
        }
    }
}
