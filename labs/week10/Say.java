interface Sayo {
    public void yo(String str);
}

public class Say {
    public static void main(String[] args) {
        Sayo s = (str) -> System.out.println(str); // Must return string
        s.yo("Hello World");

        // if void, it doesn't require an appropriate return type
        // if it has a return type, it must return the type

    }
}