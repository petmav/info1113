package info1113.labs.week5;

// basic class
public class Transaction {
    
    private String date;
    private String description;
    private double amount;

    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
    
    public String getDescription() {
        return description;
    }

    

    
}
