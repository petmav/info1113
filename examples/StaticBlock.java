public class StaticBlock {

    public static int x;
    public static int y = 10;

    static {
        x = 100;
    }

    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
    }
}
