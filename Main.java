// Name: Urzalla Razmowar
// Date: 08/04/2026
// Purpose: Demonstrates inheritance and composition.

public class Main {

    public static void main(String[] args) {

        System.out.println("=============================================");
        System.out.println("Project Week 2");
        System.out.println("Software Design: Interfaces and Polymorphism");
        System.out.println("Urzalla Razmowar");
        System.out.println("Welcome to the Rolodex Contacts Application");
        System.out.println("The sample contacts are displayed below");
        System.out.println("=============================================");
        System.out.println();

        Address homeAddress = new Address(
                "123 Main St",
                "Virginia Beach",
                "VA",
                "23452");
        
        PersonalContact personal = new PersonalContact(
                "John",
                "Smith",
                "555-1234",
                "john@hotmail.com",
                homeAddress,
                "Friend");
        
        Address workAddress = new Address(
                "500 Business Rd",
                "Norfolk",
                "VA",
                "23510");

        BusinessContact business = new BusinessContact(
                "Jane",
                "Doe",
                "555-4321",
                "jane@company.com",
                workAddress,
                "ABC Company");
        
        // Polymorphism: different contact objects are stored as Displayable objects.
        Displayable[] contacts = { personal, business };

        // The same interface method calls the correct version for each object.
        for (Displayable contact : contacts) {
                contact.displayInformation();
        }
    }
}