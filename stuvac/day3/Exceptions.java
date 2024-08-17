import java.io.*;

/**
 * Demonstrating exceptions, for more see:
 * @see https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
 */
public class Exceptions {

    public static void main(String[] args) throws ArithmeticException { // throws is not needed in this case, just for use in other instances

        int a = 5;
        int b = 10;

        System.out.println(a/b); // this is 0 as integer division is used (5/10 = 0.5, but 0.5 is not an integer)

        a = 5;
        b = 0;

        try {
            System.out.println(a/b); // this will throw an exception as you cannot divide by 0
        } catch (ArithmeticException e) { // this is NOT a checked exception, as ArithmeticException is a subclass of RuntimeException
            System.out.println("Cannot divide by 0");
        }

        // Exceptions.exampleOfChecked(); this will throw an exception as it is a checked exception

        try {
            Exceptions.exampleOfChecked(); // this will throw an exception, and MUST be caught before compilation, which is what is done here
        } catch (Exception e) {
            System.out.println("Checked exception");
        }


    }

    public static void exampleOfChecked() throws Exception {
        throw new Exception();
    }
    
}
