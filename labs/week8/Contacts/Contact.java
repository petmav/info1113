import java.util.*;

public class Contact {

    public String name;
    public Address address;
    public PhoneNumber[] phoneNumbers;
    public EmailAddress[] emailAddresses;

    public Contact(String name, Address address, PhoneNumber[] phoneNumbers, EmailAddress[] emailAddresses) {
        this.name = name;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
        this.emailAddresses = emailAddresses;
    }
    
}
