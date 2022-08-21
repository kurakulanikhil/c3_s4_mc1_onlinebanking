package base;

public class SavingsAccount extends BankAccount {
   private double rateOfInterest;

    public SavingsAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBanking, double availableBalance, double totalBalance, double rateOfInterest, double rateOfInterest1) {
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBanking, availableBalance, totalBalance, rateOfInterest);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double getRateOfInterest() {
        return rateOfInterest;
    }

    @Override
    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
    public double withDrawl(int amount){
        return getAvailableBalance() - amount;
    }
    public double creditAmount(int amount){
        return getAvailableBalance() + amount;
    }
    public void display(){
        System.out.println("available balance = " +getAvailableBalance());

}
}
