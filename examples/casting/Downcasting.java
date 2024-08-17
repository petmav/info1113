public class Downcasting {

    public static void main(String[] args) {

        try {
            Object o = Downcasting.getSomething();
            String s = (String) o;
        } catch (ClassCastException e) {
            System.out.println("Yeah you can't do that");
        }

        try {
            Object o = Downcasting.getSomethingString();
            String s = (String) o;
            System.out.println("But you can do this :D");
        } catch (ClassCastException e) {
            System.out.println("Yeah you can't do that");
        }

    }

    public static Object getSomething() {
        return new Object();
    }

    public static String getSomethingString() {
        return "Hello!";
    }
}