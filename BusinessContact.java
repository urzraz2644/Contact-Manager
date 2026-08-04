// Name: Urzalla Razmowar
// Date: 08/04/2026
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
    public void displayInformation() {
        System.out.println("Business Contact");
        super.displayInformation();
        System.out.println("Company: " + company);
        System.out.println();
    }
}