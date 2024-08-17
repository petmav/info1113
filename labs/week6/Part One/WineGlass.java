public class WineGlass extends Vessel{

    public double litres;
    public double maxLitres;
    public boolean isBroken;

    public WineGlass(double litres, double maxLitres, boolean isBroken) {
        this.litres = litres;
        this.maxLitres = maxLitres;
        this.isBroken = isBroken;
    }

    // sad
    public void smash() {
        this.isBroken = true;
        this.litres = 0;
        this.maxLitres = 0;
    }

    // cases to check if broken, exclusive to WineGlass
    public double pour(Vessel v, double amount) {

        if (v == null) {
            return 0;
        }

        if (this.isBroken) {
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
    
        litres = Math.min(litres + amount, getCapacity());
        System.out.println("" + amount + litres + getCapacity());

    }

}
