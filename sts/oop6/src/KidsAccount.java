public class KidsAccount extends SavingsAccount{
    private String guardianName;

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public KidsAccount(String accountNumber, String acc_holderName, float availableAmount, float withdrawalLimit,String guardianName) {
        super(accountNumber, acc_holderName, availableAmount, withdrawalLimit);
        this.guardianName=guardianName;
    }

    @Override
    float withdrawals(float amount) {
        if (getAcc_holderName().equals(this.guardianName)){
            super.setAvailableAmount(getAvailableAmount()-amount);
            return getAvailableAmount();
        }else {
            System.out.println("SORRY...Only guardian can be withdraw money.");
        }
        return 0;
    }

    @Override
    float deposits(float amount) {
        float accountBalance=getAvailableAmount()+amount;
        return accountBalance;
    }

    @Override
    public void printAccountDetails() {
        super.printAccountDetails();
    }
}
