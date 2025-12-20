package service;
import model.Transaction;

public class TransactionValidator {
    public static void validate(Transaction tx) {
        if (tx == null) {
            throw new IllegalArgumentException("TRANSACTION IS EMPTY!");
        }
        if (tx.getDate() == null) {
            throw new IllegalArgumentException("TRANSACTION DATE IS EMPTY!");
        }

        if (tx.getAmount() <= 0) {
            throw new IllegalArgumentException("TRANSACTION AMOUNT IS INVALID! IT MUST BE GREATER THAN 0    ");
        }
    }
}
