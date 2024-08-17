public class CountingNumbers {

  public static void main(String[] args) {

    // count from a to b
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    for (int i = a; i <= b; i++) {
      System.out.println(i);
    }
  }
}
