public class FilteredJug extends Vessel {

    public int numberOfUses;

    public FilteredJug(double litres, double maxLitres, int numberOfUses) {
        this.litres = litres;
        this.maxLitres = maxLitres;
        this.numberOfUses = numberOfUses;
    }

    public double pour(Vessel v, double amount) {

        if (amount > this.litres) {
            amount = this.litres;
        }

        litres -= amount;
        v.fill(amount);

        return amount;

    }

    public void fill(double amount) {

        if (this.numberOfUses >= 30) {
            return;
        } else if (amount > this.maxLitres) {
            amount = this.maxLitres;
        }

        litres = Math.min(litres + amount, getCapacity());

    }

    public void changeFilter(String s) {
        this.numberOfUses = 0;
    }

}
