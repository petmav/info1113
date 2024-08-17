// superior import
import java.util.*;

// fibonacci sequence through recursion, alongside memoization (not a child saying memorisation lol)
public class Fibonacci {

  // stores computed values for memoization (decreased processing)
  Map<Integer, Integer> cache = new HashMap<>();

  // memoised fibonacci method
  public int fibonacci_cached(int n) {

    // base cases
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }

    if (!cache.containsKey(n)) {
      return cache.put(n, fibonacci(n - 1) + fibonacci(n - 2));
    }

    // recursive case/general case
    
    return cache.get(n);
  }

  // non-memoised fibonacci method
  public int fibonacci(int n) {

    // base cases
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }

    // recursive case/general case
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  // testing
  public static void main(String[] args) {
    Fibonacci f = new Fibonacci();
    System.out.println(f.fibonacci_cached(100));
  }
}
