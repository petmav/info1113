public class VolumeOfCylinder {
    final static double PI = 3.141592;

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Not enough arguments.");
            return;
        }

        if (args.length > 2) {
            System.out.println("Too many arguments.");
            return;
        }

        double radius = Double.parseDouble(args[0]);
        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            return;
        }

        double height = Double.parseDouble(args[1]);
        if (height < 0) {
            System.out.println("Height cannot be negative.");
            return;
        }

        double volume = PI * (radius * radius) * height;
        System.out.printf("The volume of the cylinder is %.2f.\n", volume);
    }
}