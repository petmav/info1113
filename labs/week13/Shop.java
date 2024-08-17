import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    HashMap<Integer, Integer> items;

    public Shop() {

        items = new HashMap<Integer, Integer>();

    }

    public void addProduct(int productID, int numOfItems) {

        items.put(productID, numOfItems);

    }

    // throws exception indicates that the method can throw an exception, and leaves it for the caller to handle
    public void sell(int productID, int numOfItems) throws InsufficientItemException {

        if (items.containsKey(productID)) {
            if (items.get(productID) >= numOfItems) {
                items.put(productID, items.get(productID) - numOfItems);
            } else {
                throw new InsufficientItemException("Insufficient items");
            }
        } else {
            throw new InsufficientItemException("Insufficient items");
        }
    } 

}

// custom exception to handle
class InsufficientItemException extends Exception {

    public InsufficientItemException(String message) {
        super(message);
    }

}

class Main<T> {

    public static <T> void  main(String[] args) {

        Shop shop = new Shop();
        shop.addProduct(1, 10);
        shop.addProduct(2, 20);

        try {
            shop.sell(1, 5);
            shop.sell(2, 10);
            shop.sell(1, 10);
        } catch (InsufficientItemException e) {
            System.out.println(e.getMessage());
        }

    }
}
