class BankAccount { 
    //MEMBER VARIABLES

    private double checkingBalance;
    private double savingsBalance; 
    public static int numberOfAccounts; //static is shared throughout the class - like a global variable used throughout the whole class. 
    public static double totalMoney;




    // CONSTRUCTOR 
    public BankAccount(String name, double checkingBalance, double savingsBalance) { // ---- why is this not working? 
        numberOfAccounts ++ ; //starts at 0 and everytime you create a bank account it increases number of accounts by 1. 
        this.setCheckingBalance(checkingBalance);
        this.setSavingsBalance(savingsBalance);
    }

    public BankAccount() {
    }

    // METHODS 
    public void depositMoneyChecking(double checkingBalance) {
            this.checkingBalance += checkingBalance;
            // BankAccount.totalMoney += this.checkingBalance;
        }

    public void depositMoneySavings(double savingsBalance) {
            this.savingsBalance += savingsBalance;
            BankAccount.totalMoney += this.savingsBalance;
        }

    public void withdrawMoneyChecking(double checkingBalance) { 
        if(checkingBalance >= this.checkingBalance) {
            System.out.println("Insufficient Funds");
        }
        else if(checkingBalance <= this.checkingBalance) {
            this.checkingBalance -= checkingBalance;
        }
    }

    public void totalBalance() {
        System.out.println(this.savingsBalance + this.checkingBalance);
    }

    // --GETTERS & SETTERS--
    public double getCheckingBalance() {
        BankAccount.totalMoney += this.checkingBalance;
        return this.checkingBalance;
    }
    
    public void setCheckingBalance(double varamount) {
        this.checkingBalance = varamount;
    }
    
    
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double varamount) {
        this.savingsBalance = varamount;
    }
}

