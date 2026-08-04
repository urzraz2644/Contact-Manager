// Name: Urzalla Razmowar
// Date: 08/04/2026
// Purpose: Base Contact class demonstrating inheritance.

public class Contact implements Displayable {

    protected String firstName;
    protected String lastName;
    protected String phoneNumber;
    protected String email;

    // Composition: Contact contains an Address object
    protected Address contactAddress;

    public Contact(String firstName, String lastName,
                   String phoneNumber, String email,
                   Address contactAddress) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.contactAddress = contactAddress;
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Address: " + contactAddress);
    }
}