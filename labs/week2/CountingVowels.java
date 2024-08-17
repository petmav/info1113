public class CountingVowels {

  public static void main(String[] args) {

    String s = args[0];
    int count = 0;

    // simple for loop to count vowels (a, e, i, o, u)
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        count++;
      }
    }

    System.out.println("Number of vowels: " + count);
  }
}
