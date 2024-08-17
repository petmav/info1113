// abstract classes can have abstract and non-abstract methods, allowing for polymorphism (children can have different methods)
abstract class Vessel {
    
    protected double litres;
    public double maxLitres;

    // custom constructor, albeit unused
    protected Vessel() {
    }

    public abstract double pour(Vessel v, double amount);

    public abstract void fill(double amount);

    public double getLitres() {
        return litres;
    }

    public double getCapacity() {
        return maxLitres;
    }

    @Override
    public String toString() {
        return "Vessel{" + "litres=" + litres + ", maxLitres=" + maxLitres + '}';
    }

}
