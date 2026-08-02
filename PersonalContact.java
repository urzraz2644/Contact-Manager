// Name: Urzalla Razmowar
// Date: 08/01/2026
// Purpose: Child class that demonstrattes inheritance from Contact.

public class PersonalContact extends Contact {

    private String relationship;

    public PersonalContact(
            String firstName,
            String lastName,
            String phoneNumber,
            String email,
            Address contactAddress,
            String relationship) {

        super(firstName, lastName, phoneNumber, email, contactAddress);
        this.relationship = relationship;
    }
    
    @Override
    public void displayContact() {
        System.out.println("Personal Contact");
        super.displayContact();
        System.out.println("Relationship: " + relationship);
        System.out.println();
    }
}