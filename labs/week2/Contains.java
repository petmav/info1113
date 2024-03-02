public class Contains {

    void static main(String[] args) {
        String s = args[0];
    }

    static boolean contains(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return true;
            }
        }
        return false;
    }

}