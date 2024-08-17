public class PhoneNumber {
    
    public String number;
    public ContactTag tag;
    public String type;

    public PhoneNumber(String number, ContactTag tag, String type) {
        this.number = number;
        this.tag = tag;
        this.type = type;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ContactTag getTag() {
        return this.tag;
    }

    public void setTag(ContactTag tag) {
        this.tag = tag;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

}
