// imports, get used to them (java.util.* is superior)
import java.util.Arrays;

public class ArrayUnion {

  // static means we can call it without creating an object instance
  static int[] union(int[] a, int[] b) {

    // create new array of size a + b
    int[] c = new int[a.length + b.length];

    int i = 0;

    // fill it with values from a and b (a first, then b)
    for (int num : a) {
      c[i] = num;
      i++;
    }
    for (int num : b) {
      c[i] = num;
      i++;
    }
    return c;
  }

  // test method
  public static void main(String[] args) {

    int[] a = {1, 2, 3};
    int[] b = {4, 5, 6};
    int[] c = union(a, b);

    // print the result, might not be very clear as toString can behave weird
    System.out.println(Arrays.toString(c));
  }
}
