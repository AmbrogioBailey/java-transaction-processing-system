import model.Transaction;
import service.TransactionParser;
import service.TransactionProcessor;

import java.util.ArrayList;
import java.util.List;
import util.FileUtils;

import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        List<String> lines = FileUtils.readLines("data/transactions.csv");

        List<Transaction> transactions = new ArrayList<>();

        for (String line : lines) {
            transactions.add(TransactionParser.parse(line));
        }

        TransactionProcessor processor = new TransactionProcessor();
        processor.process(transactions);

        System.out.println("\n--- ACCOUNT SUMMARY ---");
        System.out.println("Total Deposits: " + df.format(processor.getTotalDeposits()));
        System.out.println("Total Withdrawals: " + df.format(processor.getTotalWithdrawals()));
        System.out.println("Balance: " + df.format(processor.getBalance()));
    }
}
