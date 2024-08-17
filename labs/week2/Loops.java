public class Loops {

  public static void main(String[] args) {

    System.out.println("while loop");
    int i = 0;
    while (i < 0) {
      System.out.println(i);
      i++;
    } // This will not print anything because it will check the condition before running the loop.

    System.out.println("\ndo-while loop");
    do {
      System.out.println(i);
      i++;
    } while (i
        < 0); // This will print 0 because it will run the loop first and then check the condition.

    System.out.println("\nfor loop");
    for (int j = 0; j < 0; j++) {
      System.out.println(j);
    } // This will not print anything because it will check the condition before running the loop.

    System.out.println("for loop with iteration (k++)");
    for (int k = 0; k < 5; k++) {
      System.out.println(k);
    } // This will print 0, 1, 2, 3, 4 because it will run the loop first and then check the
    // condition.

    System.out.println("for loop with iteration (++k)");
    for (int k = 0; k < 5; ++k) {
      System.out.println(k);
    } // This will print 0, 1, 2, 3, 4 because it will run the loop first and then check the
    // condition, but it will increment the value of k before printing it.

    System.out.println("for-each loop");
    int[] numbers = {1, 2, 3, 4, 5};
    for (int number : numbers) {
      System.out.println(number);
    } // This will print 1, 2, 3, 4, 5 because it will run the loop for each element in the array.
  }
}
