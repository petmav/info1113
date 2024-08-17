public class Contains {

  public static void main(String[] args) {
    ;
  }

  static boolean contains(int[] a, int b) {

    // simple for loop to check if b is in a via boolean
    for (int num : a) {
      if (num == b) {
        return true;
      }
    }
    return false;
  }
}
