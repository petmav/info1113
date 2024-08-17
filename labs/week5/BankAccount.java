// package isn't necessary iirc
package info1113.labs.week5;

// arraylist my beloved
import java.util.ArrayList;

// more complex classes, with new methods and modifiers
public class BankAccount {

    // private variables, means they can only be accessed in this class
    private long accountNumber;
    private long BSB;
    private double balance;
    private double interest;
    private ArrayList<Transaction> transactions;

    // custom constructor, makes the class
    public BankAccount(long accountNumber, long BSB, double balance, double interest) {
        this.accountNumber = accountNumber;
        this.BSB = BSB;
        this.balance = balance;
        this.interest = interest;
        this.transactions = new ArrayList<Transaction>();

    }

    // methods
    public double performTransaction(Transaction transaction) {
        transactions.add(transaction);
        balance += transaction.getAmount();
        return balance;
    }

    public void gainInterest() {
        balance += balance * interest;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account Number: " + accountNumber + " BSB: " + BSB + " Balance: " + balance + " Interest: " + interest;
    }

    // test
    public static void main(String[] args) {

        BankAccount account = new BankAccount(0, 0, 400, 0.1);
        Transaction transaction = new Transaction("01/01/2020", "Deposit", 100);
        account.performTransaction(transaction);
        System.out.println(account.getBalance());
        account.gainInterest();
        System.out.println(account.getBalance());

    }

}
