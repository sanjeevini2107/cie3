

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String accountNumber;
    private int age;
    private List<Transaction> transactions;

    public BankCustomer(String name, String accountNumber, int age) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.age = age;
        this.transactions = new ArrayList<>();
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Age: " + age);
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public void displayTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction.toString());
        }
    }

    public static class Transaction {
        private String transactionId;
        private String senderName;
        private String receiverName;
        private double amount;
        private String status; // "Successful" or "Failed"
        private String date; // DD-MM-YYYY

        public Transaction(String transactionId, String senderName, String receiverName, double amount, String status, String date) {
            this.transactionId = transactionId;
            this.senderName = senderName;
            this.receiverName = receiverName;
            this.amount = amount;
            this.status = status;
            this.date = date;
        }

        @Override
        public String toString() {
            return "Transaction ID: " + transactionId + ", Sender: " + senderName + ", Receiver: " + receiverName + ", Amount: " + amount + ", Status: " + status + ", Date: " + date;
        }
    }

    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("Nisarga", "1234567890", 21);
        customer.displayCustomerInfo();

        BankCustomer.Transaction transaction1 = new BankCustomer.Transaction("TXN001", "Nisarga", "John Doe", 1000.0, "Successful", "10-09-2024");
        BankCustomer.Transaction transaction2 = new BankCustomer.Transaction("TXN002", "Nisarga", "Jane Doe", 500.0, "Successful", "11-09-2024");

        customer.addTransaction(transaction1);
        customer.addTransaction(transaction2);

        System.out.println("Transactions:");
        customer.displayTransactions();
    }
}
