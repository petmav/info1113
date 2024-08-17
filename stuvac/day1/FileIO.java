import java.util.*;
import java.io.*;

public class FIleIO {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    

}
