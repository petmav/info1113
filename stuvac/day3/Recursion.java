public class Recursion {

    public static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public static void main(String[] args) {

        Recursion.fibonnaci(100);
        
    }

    public static int fibonnaci(int n) {

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        if (n == 0) { // base case
            return 0;
        } 
        
        else if (n == 1) { // base case #2
            return 1;
        }

        else if (!memo.containsKey(n)) {
            memo.put(n, fibonnaci(n-1) + fibonnaci(n-2));
        }

        return memo.get(n);
    }
    
}
