package designprinciples.assistedproblems;

import java.util.*;

class Account {
    private static int counter = 1001;

    private int accountNumber;
    private double balance;
    private Bank bank; 

    public Account(Bank bank, double initialDeposit) {
        this.accountNumber = counter++;
        this.bank = bank;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
    }
}

class Customer {
    private String name;
    private List<Account> accounts; 

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void viewBalance() {
        System.out.println("\n👤 Customer: " + name);
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }

        for (Account acc : accounts) {
            System.out.println("Account No: " + acc.getAccountNumber() +
                    " | Bank: " + acc.getBank().getBankName() +
                    " | Balance: ₹" + acc.getBalance());
        }
    }
}

class Bank {
    private String bankName;
    private List<Customer> customers; 

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void openAccount(Customer customer, double initialDeposit) {
        Account newAccount = new Account(this, initialDeposit);

        customer.addAccount(newAccount);

        if (!customers.contains(customer)) {
            customers.add(customer);
        }

        System.out.println("✅ Account opened for " + customer.getName() +
                " in " + bankName + " | Account No: " + newAccount.getAccountNumber());
    }

    public void showCustomers() {
        System.out.println("\n🏦 Bank: " + bankName + " Customers List:");
        if (customers.isEmpty()) {
            System.out.println("No customers yet.");
            return;
        }
        customers.forEach(c -> System.out.println("- " + c.getName()));
    }
}

public class BankAccountHolders {
    public static void main(String[] args) {

        Bank hdfc = new Bank("HDFC Bank");
        Bank sbi = new Bank("SBI");

        Customer navam = new Customer("Navam");
        Customer rahul = new Customer("Rahul");

    
        hdfc.openAccount(navam, 5000);
        hdfc.openAccount(navam, 2000);

        sbi.openAccount(navam, 10000); 
        sbi.openAccount(rahul, 3000);

        
        navam.viewBalance();
        rahul.viewBalance();

        hdfc.showCustomers();
        sbi.showCustomers();
    }
}

