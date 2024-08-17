import java.util.ArrayList;

public class Wildcards {

    public static ArrayList<? extends Number> addItems() {

        ArrayList<Number> list = new ArrayList<Number>();

        list.add(1);
        list.add(2.0);
        list.add(3.0f);

        return list;
    }

    public static void main(String[] args) {
            
            ArrayList<? extends Number> list = Wildcards.addItems();
    
            for (Number n : list) {
                System.out.println(n.getClass());
            }
    }
    
}
