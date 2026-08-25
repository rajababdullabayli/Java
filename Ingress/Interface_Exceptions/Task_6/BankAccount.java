package Task_6;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws IllegalAccessException {
        if (amount <= 0 || amount > balance) {
            throw new IllegalAccessException("Məbləğ yanlışdır");
        }
        balance -= amount;
    }
}
