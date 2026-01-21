package oopsproblems;

interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public abstract double calculateInterest();

    public abstract void displayDetails();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }

    @Override
    public void displayDetails() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Holder Name: " + getHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}

class CurrentAccount extends BankAccount {
    private double interestRate = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Holder Name: " + getHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}

public class BankingSystem {
    public static void processAccount(BankAccount account) {
        account.displayDetails();
        System.out.println("Interest: " + account.calculateInterest());

        if (account instanceof Loanable loanable) { 
            loanable.applyForLoan(10000);
            System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SAV123", "John Doe", 50000);
        BankAccount current = new CurrentAccount("CUR456", "Jane Doe", 20000);

        processAccount(savings);
        processAccount(current);
    }
}
