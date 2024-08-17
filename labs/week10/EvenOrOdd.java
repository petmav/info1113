interface Even {
    public boolean isEven(int n);
} // functional interfaces

public class EvenOrOdd {

    public static void main(String[] args) {
        Even e = (n) -> n % 2 == 0;
        System.out.println(e.isEven(4));
        System.out.println(e.isEven(5));

        // isEven is a boolean, so it must return a boolean
        // Even e is assigned to the return type n % 2 == 0 which is a boolean
        
    }
}