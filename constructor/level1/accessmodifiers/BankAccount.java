package constructor.level1.accessmodifiers;

public class BankAccount {
    public Integer accountNumber;
    protected String accountHolder;
    private Integer balanace;

    public Integer getBalanace() {
        return balanace;
    }

    public void setBalanace(Integer balanace) {
        this.balanace = balanace;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(Integer accountNumber, String accountHolder, Integer balanace) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        setBalanace(balanace);
    }

    void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalanace());
    }

    public static void main(String[] args) {
        SavingsAccount navamAccount = new SavingsAccount(12345, "Navam", 10000);
        navamAccount.displaySavingsAccountDetails();
    }
    
}
