package info1113.labs.week5;

// inherit from BankAccount, BankAccount is superclass
public class Savings extends BankAccount{
    
    private double savingsInterestrate;


    public Savings(long accountNumber, long BSB, double balance, double interest, double savingsInterestrate) {
        // hence this super() call, as super() satisfies the BankAccount constructor
        super(accountNumber, BSB, balance, interest);
        this.savingsInterestrate = savingsInterestrate;
    }
}
