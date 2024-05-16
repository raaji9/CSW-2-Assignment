package Assignment1;

abstract class Account {
    private int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate / 100);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

public class q7BankingApplication {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12345, 1000, 5);
        CurrentAccount currentAccount = new CurrentAccount(67890, 2000, 1000);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: " + savingsAccount.getBalance());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate() + "%");

        currentAccount.deposit(1000);
        currentAccount.withdraw(500);
        System.out.println("\nCurrent Account Details:");
        System.out.println("Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Balance: " + currentAccount.getBalance());
        System.out.println("Overdraft Limit: " + currentAccount.getOverdraftLimit());
    }
}