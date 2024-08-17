import java.util.*;

// interfaces allow for polymorphism, as classes which implement them can have different methods based on their implementation
public interface Interactable {

    public default void talkTo(Interactable thing) {

        List<String> responses = new ArrayList<String>();
        List<String> contact = new ArrayList<String>();

        for (int i = 0; i < contact.size() && i < responses.size(); i++) {
            System.out.println(contact.get(i));
            System.out.println(responses.get(i));
        }
    }

    public List<String> contactScript();
    public List<String> responseScript();

}
