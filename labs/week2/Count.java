public class Count {

  static int count(int[] a, int b) {

    int count = 0;

    // simple for loop to check if b is in a via count
    for (int num : a) {
      if (num == b) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {}
}
