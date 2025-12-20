package service;
import model.Transaction;
import model.TransactionType;
import java.util.List;

public class TransactionProcessor {
    private double totalDeposits;
    private double totalWithdrawals;
    private double balance;
    public void process(List<Transaction> transactions) {

        for (Transaction tx : transactions) {
            switch(tx.getType()) {
                case DEPOSIT -> {
                    totalDeposits += tx.getAmount();
                    balance += tx.getAmount();
                }
                case WITHDRAW -> {
                    totalWithdrawals += tx.getAmount();
                    balance -= tx.getAmount();
                }
            }
        }
    }
    public double getTotalDeposits() {
        return totalDeposits;
    }
    public double getTotalWithdrawals() {
        return totalWithdrawals;
    }
    public double getBalance() {
        return balance;
    }
}
