public class References {

    public static void changeString(char[] s) {

        s[0] = 'b';
        s[1] = 'c';
        s[2] = 'd';

    }

    public static void changeString(String s) {
            
            s = "bcd"; // array indexing wont work as it is immutable

    }

    public static void main(String[] args) {

        String a = "abc";
        char[] s = {'a', 'b', 'c'};
        System.out.println(a);
        System.out.println(s);
        changeString(s);
        System.out.println(a);
        System.out.println(s);

    }
}
