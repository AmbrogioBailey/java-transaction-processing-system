package service;
import model.Transaction;
import model.TransactionType;

public class TransactionParser {
    public static Transaction parse(String line) {

        // 1) split line by comma
        String[] data = line.split(",");
        if (data.length != 3) {
            throw new IllegalArgumentException("Invalid data format" + line);
        }

        // 2) extract date, type, amount
        String date = data[0].trim();
        String typeStr = data[1].trim().toUpperCase();
        TransactionType type = TransactionType.valueOf(typeStr);
        String amountStr = data[2].trim();
        // 3) convert amount string -> double
        double amount = Double.parseDouble(amountStr);
        // 4) return Transaction
        Transaction tx = new Transaction(date, type, amount);
        TransactionValidator.validate(tx);
        return tx;

    }
}
