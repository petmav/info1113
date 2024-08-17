public class Address {

    public String street;
    public String street1;
    public String postcode;
    public String state;
    public String country;

    public Address( String street, String street1, String postcode, String state, String country) {
        this.street = street;
        this.street1 = street1;
        this.postcode = postcode;
        this.state = state;
        this.country = country;
    }

    public getAddress() {
        return this.street + this.street1 + this.postcode + this.state + this.country;
    }

    public setAddress(String street, String street1, String postcode, String state, String country) {
        this.street = street;
        this.street1 = street1;
        this.postcode = postcode;
        this.state = state;
        this.country = country;
    }
    
}
