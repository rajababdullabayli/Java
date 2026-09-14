package Task_2;

import java.util.LinkedList;

public class TransactionService {
    private LinkedList<Transaction> transactions = new LinkedList<>();

    public void  addTransaction(Transaction transaction) {
        transactions.addLast(transaction);
    }

    public void removeFirstTransaction() {
        if (!transactions.isEmpty()) {
            transactions.removeFirst();
        }
    }

    public void removeLastTransaction(){
        if (!transactions.isEmpty()) {
            transactions.removeLast();
        }
    }

    public Transaction getFirstTransaction() {
        if (!transactions.isEmpty()) {
            return transactions.getFirst();
        }
        return null;
    }

    public Transaction getLastTransaction() {
        if (!transactions.isEmpty()) {
            return transactions.getLast();
        }
        return null;
    }

    public LinkedList<Transaction> getTransactions() {
        return transactions;
    }
}
