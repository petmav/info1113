public class GiftCard {

    private double amount;

    public GiftCard(double amount) {

        this.amount = amount;
        
    }

    
    public void buyBook(double totalPrice) {

        if (this.amount >= totalPrice) {

            this.amount -= totalPrice;
            System.out.println("Books bought successfully");

        } else {

            System.out.println("Insufficient funds");

        }
    }
    
    public double amountRemaining() {

        return this.amount;

    }
    
}
