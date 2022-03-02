package behavioralPatterns.chainOfResponsibility.corExample2;

public class CheckCustomerEarningsIsToEnoughToPay extends Banka {
    @Override
    public void executeProcess(Customer customer) {

            if(customer.getAylikKazanç() > 5000){
                System.out.println("Müşterinin kazancı 5000 tlden fazla olduğu için kredi verilebilir");
                super.confirmedCredit=true;
            }
            else{
                super.confirmedCredit=false;
                System.out.println("Müşterinin kazancı 5000 tlden az olduğu için kredi verilemez!!");
            }

    }
}
