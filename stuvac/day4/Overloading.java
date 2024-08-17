public class Overloading {
    

    public static void x(String x, float x2) { // initial method

    }

    public static void x(float x2, String x) { // positions of the parameters are swapped
        //Overloading.x(1, "1"); this is a call to the method below (x(int x2, String x)
        // however 'Cannot make a static reference to the non-static method x(int, String) from the type Overloading'
    }

    public static void x(String x, int x2) { // type of the second parameter is changed

    }

    public void x(int x2, String x) { // method is not static, so it is not an overload, as the method signature is the same but they are accessed differently. (Overloading.x vs new Overloading().x

    }

    public int x(String x, String x2) { // return type is changed, so it is not an overload

        return 0;
    }

    public Overloading() { // constructor

    }

    public Overloading(int x) { // constructor with different parameters, overloaded constructor

    }

}
