public class ExplicitUpcasting2 {

    public static void main(String[] args) {

        String s = "Hello";

        ExplicitUpcasting.parseObject((Object) s); // Outputs: Hi I'm an Object
        ExplicitUpcasting.parseObject(s); // Outputs: Hi I'm a String
    }

    public static void parseObject(Object o) {
        System.out.println("Hi I'm an Object");

        if (o instanceof String) {
            System.out.println("No wait, I'm a String!");
        }
    }

    public static void parseObject(String s) {
        System.out.println("Hi I'm a String");
    }
}