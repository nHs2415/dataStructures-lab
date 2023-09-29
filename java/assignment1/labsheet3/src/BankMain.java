import java.util.Random;

// BankAccount: Abstract class
abstract class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.balance = 0;
    }

    // Abstract methods
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void addInterest();

    public abstract void displayDetails();

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Helper method to generate a 10-digit account number
    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int digit = random.nextInt(10);
            sb.append(digit);
        }

        return sb.toString();
    }
}

// SavingsAccount: Subclass of BankAccount
class SavingsAccount extends BankAccount {
    private boolean isActive;
    private double monthlyFee;

    // Constructor
    public SavingsAccount() {
        this.isActive = true;
        this.monthlyFee = 0;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited: Rs." + amount);
        System.out.println("Current Balance: Rs." + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 200) {
            System.out.println("Withdrawal failed: Insufficient balance.");
            return;
        }

        setBalance(getBalance() - amount - 30);
        System.out.println("Withdrawn: Rs." + amount);
        System.out.println("Transaction fee: Rs.30");
        System.out.println("Current Balance: Rs." + getBalance());
    }

    @Override
    public void addInterest() {
        double interest = getBalance() * 5 / 100;
        setBalance(getBalance() + interest);
        System.out.println("Interest added: Rs." + interest);
        System.out.println("Current Balance: Rs." + getBalance());
    }

    @Override
    public void displayDetails() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: Rs." + getBalance());
        System.out.println("Active Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("Monthly Fee: Rs." + monthlyFee);
    }
}

// CurrentAccount: Subclass of BankAccount
class CurrentAccount extends BankAccount {
    private int checkUsed;

    // Constructor
    public CurrentAccount() {
        this.checkUsed = 0;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited: Rs." + amount);
        System.out.println("Current Balance: Rs." + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() < amount) {
            System.out.println("Withdrawal failed: Insufficient balance.");
            return;
        }

        setBalance(getBalance() - amount);
        System.out.println("Withdrawn: Rs." + amount);
        System.out.println("Current Balance: Rs." + getBalance());
    }

    @Override
    public void addInterest() {
        double excessAmount = Math.max(0, getBalance() - 300000);
        double interest = excessAmount * 2 / 100;
        setBalance(getBalance() + interest);
        System.out.println("Interest added: Rs." + interest);
        System.out.println("Current Balance: Rs." + getBalance());
    }

    public void withdrawByCheck(double amount) {
        if (checkUsed < 3) {
            setBalance(getBalance() - amount);
            checkUsed++;
            System.out.println("Withdrawn by check: Rs." + amount);
            System.out.println("Current Balance: Rs." + getBalance());
        } else {
            setBalance(getBalance() - amount - 20);
            checkUsed++;
            System.out.println("Withdrawn by check: Rs." + amount);
            System.out.println("Check fee: Rs.20");
            System.out.println("Current Balance: Rs." + getBalance());
        }
    }

    public void resetCheckUsed() {
        checkUsed = 0;
    }

    public int getCheckUsed() {
        return checkUsed;
    }

    @Override
    public void displayDetails() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: Rs." + getBalance());
        System.out.println("Checks Used: " + checkUsed);
    }
}

// BankMain: Main class
public class BankMain {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(5000);
        savingsAccount.withdraw(2000);
        savingsAccount.addInterest();
        savingsAccount.displayDetails();
        System.out.println();

        // Creating a CurrentAccount object
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(10000);
        currentAccount.withdraw(5000);
        currentAccount.addInterest();
        currentAccount.displayDetails();
        currentAccount.withdrawByCheck(3000);
        currentAccount.withdrawByCheck(2000);
        currentAccount.withdrawByCheck(1000);
        currentAccount.withdrawByCheck(500);
        currentAccount.displayDetails();
        System.out.println();

        currentAccount.resetCheckUsed();
        System.out.println("Checks Used: " + currentAccount.getCheckUsed());
    }
}