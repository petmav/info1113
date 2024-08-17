import java.util.*;

// i dont even know if this works
public class Interacting {

    public static void main(String[] args) {

        List<String> pContact = new ArrayList<String>();
        pContact.add("How are you");
        pContact.add("What is your name");

        List<String> pResponses = new ArrayList<String>();
        pResponses.add("I am good");
        pResponses.add("My name is John");

        List<String> aContact = new ArrayList<String>();
        aContact.add("I am an alien");
        aContact.add("I will destroy you");

        List<String> aResponses = new ArrayList<String>();
        aResponses.add("aaaaaaaa");
        aResponses.add("boop");

        Person p = new Person(pContact, pResponses);
        Alien a = new Alien(aContact, aResponses, false);
        Alien b = new Alien(aContact, aResponses, true);
        Billboard bb = new Billboard("Hello");

        p.talkTo(a);
        b.talkTo(p);
        bb.talkTo(p);

        
    }
}
