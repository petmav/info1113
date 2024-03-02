public class CountDuplicates {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 3, 6, 7, 8, 9};
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        System.out.println("There are/is: " + countDuplicates(a) + " duplicate/s.");
    }

    static int countDuplicates(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == current) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}