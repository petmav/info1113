import java.util.Scanner;

public class GoldenRatio {

    public static void main(String[] args) {
        final double Golden = 1.618;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        try {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            double ratio1 = Math.max(a, b) / Math.min(a, b);
            double ratio2 = (Math.max(a, b) + Math.min(a, b)) / Math.max(a, b);

            if (Math.round(ratio1 * 1000) / 1000.0 == Golden && Math.round(ratio2 * 1000) / 1000.0 == Golden) {
                System.out.println("\nGolden ratio!");
            } else {
                System.out.println("\nMaybe next time.");
            }

        } catch (Exception e) {
            System.out.println("\nInvalid input.");
        }
    }
}