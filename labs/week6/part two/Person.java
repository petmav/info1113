import java.util.List;

public class Person implements Interactable {

    private List<String> contact;
    private List<String> responses;

    public Person(List<String> contact, List<String> responses) {
        this.contact = contact;
        this.responses = responses;

        String name = "John";
        contact.add(0, "Hello my name is " + name);
        responses.add(0, "Hello my name is " + name);
    }

    public List<String> contactScript() {
        return contact;
    }

    public List<String> responseScript() {
        return responses;
    }


    public String getName() {
        return name;
    }

}
