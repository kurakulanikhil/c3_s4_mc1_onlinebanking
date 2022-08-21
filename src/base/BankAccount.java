package base;

public abstract class BankAccount {
    private long accountNumber;
    private String accountOpeningDate;
    private String modeOfOperation;
    private boolean internetBanking;
    private  double availableBalance;
    private double totalBalance;
    private double rateOfInterest;

    public BankAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBanking, double availableBalance, double totalBalance, double rateOfInterest) {
        this.accountNumber = accountNumber;
        this.accountOpeningDate = accountOpeningDate;
        this.modeOfOperation = modeOfOperation;
        this.internetBanking = internetBanking;
        this.availableBalance = availableBalance;
        this.totalBalance = totalBalance;
        this.rateOfInterest = rateOfInterest;
    }



    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public boolean getInternetBanking() {
        return internetBanking;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }


    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
    public double showAccountBalance(){
        return availableBalance;
    }


}
