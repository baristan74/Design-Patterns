package behavioralPatterns.chainOfResponsibility.corExample2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Banka> bankaOperations = new ArrayList<>();

        bankaOperations.add(new CheckCustomerEarningsIsToEnoughToPay());
        bankaOperations.add(new CheckGuarantorIsFine());
        bankaOperations.add(new CheckKbbScore());
        bankaOperations.add(new CheckCustomerIsExist());


        bankaOperations.get(0).setNext(bankaOperations.get(1));
        bankaOperations.get(1).setNext(bankaOperations.get(2));
        bankaOperations.get(2).setNext(bankaOperations.get(3));

        bankaOperations.get(0).execute(new Customer(1,"4554545","Baris",900,true,5500));



        boolean creditConfirmed=bankaOperations.get(bankaOperations.size()-1).confirmedCredit;

        if(creditConfirmed){
            System.out.println("Kredi isteği onaylandı");
        }else{
            System.out.println("Kredi isteği reddedildi");
        }

    }
}
