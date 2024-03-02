import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int a = scanner.nextInt();

            if (a % 2 == 0) {
                System.out.println("The number " + a + " is even.");
            } else {
                System.out.println("The number " + a + " is odd.");
            }
        } catch (Exception e) {
            System.out.println("An error has occured.");
        }
    }

}
