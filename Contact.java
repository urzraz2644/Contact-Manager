// Name: Urzalla Razmowar
// Date: 08/16/2026
// Purpose: Abstract base Contact class demonstrating inheritance.

// Abstraction: Contact defines common information and behavior for all contact types.
public abstract class Contact implements Displayable {
    // Access specifiers: protected fields allow derived contact classes to access shared data.
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;
    protected String email;

    // Composition: Contact contains an Address object
    protected Address contactAddress;

    // Constructor initizlizes the common information shared by all contact types.
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

    // Abstract method implemented by each type of contact
    public abstract String getContactType();
}