package OOP.Task_1;

import java.util.ArrayList;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private int pin;
    private boolean isLocked;
    private int failedAttempts;
    private ArrayList<String> transactionHistory;
    private double interestRate;

    public BankAccount(String accountHolder, String accountNumber, int pin) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.isLocked = false;
        this.failedAttempts = 0;
        this.transactionHistory = new ArrayList<>();
        this.interestRate = interestRate = 5.0;

        int tempPin = pin;
        int pinLength = 0;
        while (tempPin > 0) {
            tempPin /= 10;
            pinLength++;
        }

        if (pinLength == 4) {
            this.pin = pin;
        } else {
            System.out.println("Error PIN must be 4 digits.Default Pin: 1234");
            this.pin = 1234;
        }

        transactionHistory.add("Account is unluck.The first balance: " + balance);
    }

    public void lockAccount() {
        if (isLocked) {
            System.out.println("Warring: incorrect PIN was entered 3 times in a row");
        }
    }

    public void deposit(double amount) {
        if (isLocked) {
            System.out.println("This account blocked");
        } else {
            if (balance <= 0) {
                System.out.println("The balance cannot negative");
            } else {
                transactionHistory.add("Deposit: " + amount);
                balance += amount;
            }
        }
    }

    public boolean withdraw(double amount, int enteredPin) {
        if (isLocked) {
            System.out.println("This account blocked");
            return false;
        }
        if (enteredPin != pin) {
            failedAttempts++;
            System.out.println("This pin is not correct. Failed pin attempt: " + failedAttempts);
            transactionHistory.add("Failed PIN attempt");

            if (failedAttempts >= 3) {
                lockAccount();
            }
            return false;
        }

        failedAttempts = 0;
        if (amount > balance) {
            System.out.println("There are not enough funds the balance");
            transactionHistory.add("Withdraw error: Insufficient balance. Amount: " + amount);
            return false;
        }

        balance -= amount;
        transactionHistory.add("Withdraw: " + balance);
        return true;
    }


    public void checkBalance(int enteredPin) {
        if (isLocked) {
            System.out.println("This account blocked ");
        } else {
            if (enteredPin != pin) {
                System.out.println("Not correct pin!");
            } else {
                System.out.println("Balance: " + balance);
            }
        }
    }

    public void transferTo(BankAccount receiver, double amount, int enteredPin) {
        if (isLocked) {
            System.out.println("This account blocked");
        } else {
            if (receiver == null) {
                System.out.println("Account not found");
            }
            if (withdraw(amount, enteredPin)) {
                receiver.deposit(amount);
                System.out.println("Transfer is successful");
                transactionHistory.add("Transfer: " + amount + "AZN was transferred to the receiver account " + receiver.accountNumber + " transferred");
            } else {
                System.out.println("Transfer is not successful");
                transactionHistory.add("Transfer error: Money was not deducted from the current account");
            }
        }
    }

    public void applyInterest() {
        if (isLocked){
            System.out.println("This account blocked");
        }else {
            double interestAmount = balance*interestRate/100;
            balance += interestAmount;
            System.out.println("Balance after interest application.New balance: " + balance);
        }
    }

    public void printHistory() {
        System.out.println("The Operation History ");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
