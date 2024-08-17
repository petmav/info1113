// extends from abstract superclass
public class PlasticCup extends Vessel {

    public PlasticCup(double litres, double maxLitres) {
        this.litres = litres;
        this.maxLitres = maxLitres;
    }

    public double pour(Vessel v, double amount) {

        if (v == null) {
            return 0;
        }

        if (amount > this.litres) {
            amount = this.litres;
        }

        litres -= amount;
        v.fill(amount);
        return amount;

    }

    public void fill(double amount) {

        if (amount > this.maxLitres) {
            amount = this.maxLitres;
        }

        litres = Math.min(litres + amount, getCapacity());

    }

}
