public class Main {
    public static void main(String[] args) {
        KidsAccount kid1=new KidsAccount("239456586V","Joe Doe",23000,1000,"Joe Doe");
        kid1.printAccountDetails();
        System.out.println("Current Balance :"+kid1.withdrawals(3000));

    }
}
