// Name: Urzalla Razmowar
// Date: 08/01/2026
// Purpose: Child class that demonstrates inheritance from Contact.

public class BusinessContact extends Contact {

    private String company;

    public BusinessContact (
            String firstName,
            String lastName,
            String phoneNumber,
            String email,
            Address contactAddress,
            String company) {

        super(firstName, lastName, phoneNumber, email, contactAddress);
        this.company = company;
    }

    @Override
    public void displayContact() {
        System.out.println("Business Contact");
        super.displayContact();
        System.out.println("Company: " + company);
        System.out.println();
    }
}