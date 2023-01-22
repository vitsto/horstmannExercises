package ch19.PE.Ex19_8;

public class BankAccount {
    private final String fullName;
    private int balance;

    public BankAccount(String fullName, int balance) {
        this.fullName = fullName;
        this.balance = balance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "fullName='" + fullName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
