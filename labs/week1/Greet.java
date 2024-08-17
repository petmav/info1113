import java.util.Scanner;

public class Greet {

  public static void main(String[] args) {

    // initialise scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");

    String x = input.nextLine();
    System.out.println("Hello, " + x + "!");

    // close scanner for memory
    input.close();
  }
}
