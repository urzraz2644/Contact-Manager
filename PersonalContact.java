// Name: Urzalla Razmowar
// Date: 08/23/2026
// Purpose: Child class that demonstrates inheritance from Contact.

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
    public void displayInformation() {
        System.out.println(getContactType());
        super.displayInformation();
        System.out.println("Relationship: " + relationship);
        System.out.println();
    }

    @Override
    public String getContactType() {
        return "Personal Contact";
    }
}