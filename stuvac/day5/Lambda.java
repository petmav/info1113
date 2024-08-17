interface InnerLambda {

    // can only have ONE abstract method, but can have multiple default methods

    public int operation(int a, int b);

    public default void print() {
        System.out.println("Hello World");
    }
}

public class Lambda {

    static int result;

    public static void performTask(InnerLambda operation, int a, int b) {
        System.out.println("performTaskResponse: " + operation.operation(a, b));

    }

    public static void main(String[] args) {
        
        InnerLambda add = (a, b) -> a + b;
        result = add.operation(1, 2);
        System.out.println(result);

        InnerLambda subtract = (a, b) -> a - b;
        result = subtract.operation(1, 2);
        System.out.println(result);

        InnerLambda complex = (a, b) -> {

            if (a > b) {
                return a;
            } else {
                return b;
            }
            
        };

        result = complex.operation(1, 2);
        System.out.println(result);

        complex.print();

        performTask(add, 1, 2);
        performTask(subtract, 1, 2);
    }
    
}
