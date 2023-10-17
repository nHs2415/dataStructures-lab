public class SavingsAccount extends Account{
    public float withdrawalLimit;
    public SavingsAccount(String accountNumber, String acc_holderName, float availableAmount,float withdrawalLimit) {
        super(accountNumber, acc_holderName, availableAmount);
        this.withdrawalLimit=withdrawalLimit;
    }

    @Override
    float withdrawals(float amount) {
        if (this.getAvailableAmount()-amount<this.withdrawalLimit){
            float availableBalance=getAvailableAmount()-amount;
            return availableBalance;
        }else {
            System.out.println("the amount" +
                    "should not exceed the withdrawal limit.");
        }
        return 0;
    }

    @Override
    float deposits(float amount) {
        float availableBalance=getAvailableAmount()+amount;
        return availableBalance;
    }

    @Override
    public void printAccountDetails() {
        super.printAccountDetails();

    }
}
