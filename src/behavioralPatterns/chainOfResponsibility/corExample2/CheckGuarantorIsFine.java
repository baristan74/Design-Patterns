package behavioralPatterns.chainOfResponsibility.corExample2;

public class CheckGuarantorIsFine extends Banka {

    @Override
    public void executeProcess(Customer customer) {

        if(super.confirmedCredit){ // bir sonraki adıma geçilmişse

            if(customer.isGuarantorIsFine()){
                System.out.println("Müşterinin Kefili iyi");
                super.confirmedCredit=true;
            }else{
                super.confirmedCredit=false;
                System.out.println("Müşteri kefili kötü bu sebepten kredi verilmedi");
            }

        }

    }
}
