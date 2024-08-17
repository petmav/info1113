import java.io.*;
import java.util.*;

public class AnonymousClasses {

    public static void main(String[] args) {
        
        // Anonymous class
        Student student = new Student("John", 20) {
            @Override
            public void display() {
                System.out.println("Name: " + name + ", Age: " + age);
            }
        };

        student.display(); // wont work as Student class does not have a display method, only the anonymous class has it

        // this can be fixed by creating an interface with the display method and implementing it in the anonymous class, or by
        // overriding the display method in the Student class
    }

}
