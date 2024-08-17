import java.net.InterfaceAddress;

public class Generics<T> { // correct definition of a generic class

    T x; // generic attribute - can only be accessed through an instance of the class as it is the value passed to the class

    public <T> void method(T param) { // correct definition of a generic method
        
        System.out.println(param);
    }

    public static <T> void x(T param) { // correct definition of a static generic method (always access modifiers first)

        System.out.println(param.getClass().getName());

    }

    public static void main(String[] args) {
        Generics<Integer> g = new Generics<Integer>(); // correct instantiation of a generic class
        g.method(1); // correct call to a generic method
        Generics.x(1); // correct call to a static generic method
        // Generics.x(x); incorrect call to a static generic method, x is not defined statically
        // g.x(x); would not work as attribute x is not defined.
    }


}