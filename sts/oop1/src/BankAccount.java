import java.util.Random;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(){
        this.accountNumber=generateAccountNumber();
        this.balance=0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public abstract double deposit(double amount);
    public abstract double withdraw(double amount);
    public abstract double addInterest();
    public abstract void displayDetails();

    private String generateAccountNumber(){
        Random random=new Random();
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<10;i++){
            int digit=random.nextInt(10);
            sb.append(digit);
        }return sb.toString();
    }
 3
}

abstract class SavingsAccount extends BankAccount{
    private String activeStatus;
    private int monthlyFee;

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public SavingsAccount(){


    }

    @Override
    public double deposit(double amount) {
        double balance=getBalance()+amount;
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        double lowerBalance=200;
        double transactionFee=30;
        if (lowerBalance<=200){
            double balance=getBalance()-(transactionFee+amount);
            return balance;
        }else {
            System.out.println("Sorry insufficient balance to withdraw money...");
        }
        return 0;
    }

    @Override
    public double addInterest() {
        double interest=getBalance()*(5/100);
        double newBalance=getBalance()+interest;
        System.out.println(newBalance);
        return 0;
    }

    @Override
    public void displayDetails() {

        System.out.println(">>> Savings Account Details <<<");
        System.out.println();
    }
}

abstract class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber,double balance){
        super(accountNumber,balance);
    }

    @Override
    public double deposit(double amount) {
        double balance=getBalance()+amount;
        return balance;
    }

    @Override
    public double addInterest() {
        double excessAmount=getBalance()-300000;
        if (excessAmount>0){
            double interest=excessAmount*0.02;
            double balance=getBalance()+interest;
            return balance;
        }
        return 0;
    }

    @Override
    public double withdraw(double amount) {

        return 0;
    }
}