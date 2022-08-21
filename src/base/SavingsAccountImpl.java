package base;


//import org.w3c.dom.ls.LSOutput;

public class SavingsAccountImpl {
    public static void main(String[] args) {


        SavingsAccount obj = new SavingsAccount(2356775942L, "24/05/2000", "self operation", true, 3000, 3000, 5, 6);
        RecurringDepositAccount obj1 = new RecurringDepositAccount(234566743L, "25/07/2000", "opening", false, 4000, 4200, 6, "25/06/2003", 244);
        System.out.println("account number = " + obj.getAccountNumber());
        System.out.println("rate of interest = " + obj.getRateOfInterest());
        System.out.println("account opening date = " + obj.getAccountOpeningDate());
       // System.out.println("obj.getRateOfInterest());
        System.out.println("mode of operation = " + obj.getModeOfOperation());
        System.out.println("updated amount after withdrawl = " +obj.withDrawl(300));
        System.out.println("updated amount after credit = " +obj.creditAmount(400));
        obj.display();
        System.out.println();
        System.out.println("recurring account details");
        System.out.println("obj1.getAccountNumber() = " + obj1.getAccountNumber());
        System.out.println("obj1.getAccountOpeningDate() = " + obj1.getAccountOpeningDate());
        System.out.println("obj1 = " + obj1.getModeOfOperation());
        System.out.println("obj1 = " + obj1.getInternetBanking());
        System.out.println("obj1.getClosingDate() = " + obj1.getClosingDate());





    }

}







