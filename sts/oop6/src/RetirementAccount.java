import java.time.Year;

public class RetirementAccount extends Account{
    private int retiredYear;

    public int getRetiredYear() {
        return retiredYear;
    }

    public void setRetiredYear(int retiredYear) {
        this.retiredYear = retiredYear;
    }

    public RetirementAccount(String accountNumber, String acc_holderName, float availableAmount,int retiredYear) {
        super(accountNumber, acc_holderName, availableAmount);
        this.retiredYear=retiredYear;
    }
    public int getCurrentYear(){
        int currentYear= Year.now().getValue();
        return currentYear;
    }

    @Override
    float withdrawals(float amount) {
        if (retiredYear<=getCurrentYear()){
            super.setAvailableAmount(getAvailableAmount()-amount);
            return getAvailableAmount();

        }else {
            System.out.println("you can't withdraw money before your day of retired");
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
