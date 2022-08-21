package base;

public class RecurringDepositAccount extends BankAccount{


    private String closingDate;
    private double duration;

    public RecurringDepositAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBanking, double availableBalance, double totalBalance, double rateOfInterest, String closingDate, double duration) {
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBanking, availableBalance, totalBalance, rateOfInterest);
        this.closingDate = closingDate;
        this.duration = duration;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

}
