package model;
import model.TransactionType;

public class Transaction {
    /*
     fields, constructor, methods
     Transaction needs to store data, describe fields, provide getters, provide toString()
    */
    private String date;
    private TransactionType type;
    private double amount;
    public Transaction(String date, TransactionType type, double amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }
    public String getDate() {
        return date;
    }
    public TransactionType getType() {
        return type;
    }
    public double getAmount() {
        return amount;
    }
    @Override
    public String toString(){
        return date + " " + type + " " + amount;
    }
}


