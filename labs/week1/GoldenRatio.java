import java.util.Scanner;

public class GoldenRatio {

  public static void main(String[] args) {

    // Golden ratio
    final double Golden = 1.618;

    // Get user input
    Scanner scanner = new Scanner(System.in);

    // Text to indicate input
    System.out.print("Enter two numbers: ");

    try {

      // Get user input
      double a = scanner.nextDouble();
      double b = scanner.nextDouble();
      scanner.close();

      // Calculate ratio
      double ratio1 = Math.max(a, b) / Math.min(a, b);
      double ratio2 = (Math.max(a, b) + Math.min(a, b)) / Math.max(a, b);

      // Print result
      if (Math.round(ratio1 * 1000) / 1000.0 == Golden
          && Math.round(ratio2 * 1000) / 1000.0 == Golden) {
        System.out.println("\nGolden ratio!");
      } else {
        System.out.println("\nMaybe next time.");
      }

    // exception handling
    } catch (Exception e) {
      System.out.println("\nInvalid input.");
    }
  }
}
