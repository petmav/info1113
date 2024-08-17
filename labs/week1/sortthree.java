public class SortThree {

  public static void main(String[] args) {

    // sort three numbers given as arguments
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    int z = Integer.parseInt(args[2]);

    // conditionals
    if (x > y) {
      int temp = x;
      x = y;
      y = temp;
    }
    if (x > z) {
      int temp = x;
      x = z;
      z = temp;
    }
    if (y > z) {
      int temp = y;
      y = z;
      z = temp;
    }

    System.out.println(x + " " + y + " " + z);
  }
}
