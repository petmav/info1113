// dont even ask about these, i forgot what we were talking about
import java.util.*;

public class Alien implements Interactable{

    private List<String> contact;
    private List<String> responses;
    private boolean isHostile;

    public Alien(List<String> contact, List<String> responses, boolean isHostile) {
        this.contact = contact;
        this.responses = responses;
        this.isHostile = isHostile;
    }

    public List<String> contactScript() {
        return contact;
    }

    public List<String> responseScript() {
        return responses;
    }

    @Override
    public void talkTo(Interactable thing) {
        if (!isHostile) {
            Interactable.super.talkTo(thing);
            return;
        }

        System.out.println("I am an alien, I will destroy you!");
    }

}
