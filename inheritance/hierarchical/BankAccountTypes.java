package inheritance.hierarchical;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate; // in %

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    public void showSavingsDetails() {
        showBalance();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    public void showCheckingDetails() {
        showBalance();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int lockInPeriod; 

    public FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    public void showFDDetails() {
        showBalance();
        System.out.println("Lock-in Period: " + lockInPeriod + " months");
    }
}



public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("SA1001", 50000, 4.5);
        CheckingAccount c1 = new CheckingAccount("CA2001", 25000, 10000);
        FixedDepositAccount f1 = new FixedDepositAccount("FD3001", 100000, 12);

        s1.displayAccountType();
        s1.showSavingsDetails();

        System.out.println();

        c1.displayAccountType();
        c1.showCheckingDetails();

        System.out.println();

        f1.displayAccountType();
        f1.showFDDetails();
    }
}
