import java.util.Scanner;

public class OddEven {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");

    try {

      // get user input
      int a = scanner.nextInt();

      // check if number is even or odd through modulo
      // 0 = even, 1 = odd
      if (a % 2 == 0) {
        System.out.println("The number " + a + " is even.");
      } else {
        System.out.println("The number " + a + " is odd.");
      }

    // exception handling
    } catch (Exception e) {
      System.out.println("An error has occured.");
    }

    // close scanner for memory
    scanner.close();
  }
}
