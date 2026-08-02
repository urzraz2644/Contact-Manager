// Name: Urzalla Razmowar
// Date: 08/01/2026
// Purpose: Address class used by Contact through composition.

public class Address {

    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;

    }
}