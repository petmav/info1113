public class VolumeOfCylinder {
  static final double PI = Math.PI;

  public static void main(String[] args) {

    // check if enough arguments
    if (args.length < 2) {
      System.out.println("Not enough arguments.");
      return;
    }

    // check if too many arguments
    if (args.length > 2) {
      System.out.println("Too many arguments.");
      return;
    }

    // check if radius and height are negative
    double radius = Double.parseDouble(args[0]);
    if (radius < 0) {
      System.out.println("Radius cannot be negative.");
      return;
    }

    // check if height is negative
    double height = Double.parseDouble(args[1]);
    if (height < 0) {
      System.out.println("Height cannot be negative.");
      return;
    }

    // calculate volume if no other statements hit
    double volume = PI * (radius * radius) * height;
    System.out.printf("The volume of the cylinder is %.2f.\n", volume);
  }
}
