import java.util.*;

// forgot if this works, had some assistance from stackoverflow and GenAI
public class PascalTriangle {

  private static Map<Integer, List<Integer>> cache = new HashMap<>();

  // recursive method to calculate binomial coefficient
  public static List<Integer> pascalRecursive(int n) {

    if (cache.containsKey(n)) {
      return cache.get(n);
    }

    if (n == 0) {
      return Arrays.asList(1);
    } else {
      List<Integer> previous = pascalRecursive(n - 1);
      List<Integer> current = new ArrayList<>();
      current.add(1);
      for (int i = 1; i < previous.size(); i++) {
        current.add(previous.get(i - 1) + previous.get(i));
      }
      current.add(1);
      cache.put(n, current);
      return current;
    }
  }

  public static void main(String[] args) {
    PascalTriangle p = new PascalTriangle();
    System.out.println(PascalTriangle.pascalRecursive(Integer.parseInt(args[0])));
  }
}
