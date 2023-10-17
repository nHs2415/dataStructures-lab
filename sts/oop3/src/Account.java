public class Account {
    private String acc_no;
    private String name;
    private String email;
    private String id;
    private double amount;

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account(){

    }
}

class bank{
    public static void main(String[] args) {
        Account account=new Account();
        account.setAcc_no(" 39929911234");
        account.setName("Nimal Jayasinghe");
        account.setId("981232234V");
        account.setEmail("nimalj@gmail.com");
        account.setAmount(25000);

        System.out.println( "Account Number               : "+account.getAcc_no()+
                            "\nName of the account holder   : "+account.getName()+
                            "\nID of the account holder     : "+account.getId()+
                            "\nE-mail of the account holder : "+account.getEmail()+
                            "\nTotal amount deposited       : "+account.getAmount());

        if(account.getAcc_no().equals(null)){
            System.out.println("Invalid Account Number");
        }else {
            System.out.println("Account Number               : "+account.getAcc_no()+
                    "\nName of the account holder   : "+account.getName()+
                    "\nID of the account holder     : "+account.getId()+
                    "\nE-mail of the account holder : "+account.getEmail()+
                    "\nTotal amount deposited       : "+account.getAmount());
        }
    }

}
