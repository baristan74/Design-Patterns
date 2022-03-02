package behavioralPatterns.chainOfResponsibility.corExample2;

public class CheckCustomerIsExist extends Banka{


    @Override
    public void executeProcess(Customer customer) {

        boolean customerIsExits = true;

        if(super.confirmedCredit){

            if(customerIsExits){
                System.out.println("Müşteri mevcut kredi verilebilir");
                super.confirmedCredit=true;
            }
            else{
                System.out.println("Böyle bir kullanici mevcut değil");
                super.confirmedCredit=false;
            }


        }
    }
}
