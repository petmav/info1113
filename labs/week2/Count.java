public class Count {

    static int count(int[] a, int b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    }
}