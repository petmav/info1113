import java.util.Arrays;

public class ArrayUnion {

    static int[] union(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            c[i] = a[j];
            i++;
        }
        for (int j = 0; j < b.length; j++) {
            c[i] = b[j];
            i++;
        }
        return c;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = union(a, b);

        System.out.println(Arrays.deepToString(a));

    }
}