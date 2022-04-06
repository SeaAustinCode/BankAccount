public class TestBankAccount {
    public static void main(String[] args) {

        //Instantiating objects
        BankAccount jeff = new BankAccount("Jeff", 5000.00, 10000.00); //these intial amounts are not getting set up. 
        BankAccount emily = new BankAccount("Emily", 7500, 75000);

    System.out.println(jeff.getCheckingBalance());
    System.out.println(jeff.getSavingsBalance());
    jeff.depositMoneyChecking(500.49);
    emily.depositMoneyChecking(690.45);
    jeff.withdrawMoneyChecking(100.24);
    emily.withdrawMoneyChecking(500);
    System.out.println("Jeff's Checking Balance = " + jeff.getCheckingBalance());
    System.out.println("Emily's Checking Balance = " + emily.getCheckingBalance());
    emily.totalBalance();
    }
}