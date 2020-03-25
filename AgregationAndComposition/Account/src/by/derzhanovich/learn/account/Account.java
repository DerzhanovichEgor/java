package by.derzhanovich.learn.account;

public class Account{
    private double balance;
    private boolean isBlocked = false;
    private int accountNumber;
    private double rate;

    public Account() {
    }

    public Account(double balance, int accountNumber, double rate) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", isBlocked=" + isBlocked +
                ", accountNumber=" + accountNumber +
                ", rate=" + rate +
                '}';
    }


}
