public abstract class Account {
    private String accountNumber;
    private String acc_holderName;
    private float availableAmount;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAcc_holderName() {
        return acc_holderName;
    }

    public void setAcc_holderName(String acc_holderName) {
        this.acc_holderName = acc_holderName;
    }

    public float getAvailableAmount() {

        return availableAmount;
    }

    public void setAvailableAmount(float availableAmount) {

        this.availableAmount = availableAmount;
    }

    public Account(String accountNumber, String acc_holderName, float availableAmount) {
        this.accountNumber = accountNumber;
        this.acc_holderName = acc_holderName;
        this.availableAmount = availableAmount;
    }

    abstract float withdrawals(float amount);
    abstract float deposits(float amount);
    public void printAccountDetails(){
        System.out.println("Account Number : "+this.accountNumber);
        System.out.println("Account Holder\'s Name : "+this.acc_holderName);
        System.out.println("Available Balance : "+this.availableAmount);
    }
}
