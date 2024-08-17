package main.java.Test;

public class JUnit {

    int x = 1;
    int y = 2;

    public int add() {
        return x + y;
    }

    public int subtract() {
        return x - y;
    }

    public int multiply() {
        return x * y;
    }

    public int divide() {
        return x / y;
    }

    public int modulo() {
        return x % y;
    }

    public JUnit(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}
