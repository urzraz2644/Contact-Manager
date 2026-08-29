// Name: Urzalla Razmowar
// Date: 08/29/2026
// Purpose: Runs the Rolodex Contacts Application and provides database interactions.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        // Create the SQLite contacts table
        DatabaseManager.createTable();

        // Project information and welcome message
        System.out.println("========================================");
        System.out.println("Project Week 5");
        System.out.println("Database Interactions");
        System.out.println("Urzalla Razmowar");
        System.out.println("Welcome to the Rolodex Contacts Application");
        System.out.println("Use the numbered menu to manage contacts.");
        System.out.println("========================================");

        do {

            System.out.println("\nContact Menu");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Search Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Add Contact selected.");

                    System.out.print("Enter contact type: ");
                    String contactType = scanner.nextLine();

                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();

                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter street: ");
                    String street = scanner.nextLine();

                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();

                    System.out.print("Enter state: ");
                    String state = scanner.nextLine();

                    System.out.print("Enter zip code: ");
                    String zipCode = scanner.nextLine();

                    System.out.print("Enter relationship: ");
                    String relationship = scanner.nextLine();

                    System.out.print("Enter company: ");
                    String company = scanner.nextLine();

                    DatabaseManager.addContact(
                            contactType,
                            firstName,
                            lastName,
                            phoneNumber,
                            email,
                            street,
                            city,
                            state,
                            zipCode,
                            relationship,
                            company
                    );

                    break;

                case 2:
                    System.out.println("Delete Contact selected.");

                    System.out.print("Enter contact ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();

                    DatabaseManager.deleteContact(deleteId);

                    break;

                case 3:
                    System.out.println("Update Contact selected.");

                    System.out.print("Enter contact ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();

                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();

                    DatabaseManager.updateContact(
                            updateId,
                            newPhoneNumber,
                            newEmail
                    );

                    break;

                case 4:
                    System.out.println("Display All Contacts selected.");

                    DatabaseManager.displayAllContacts();

                    break;

                case 5:
                    System.out.println("Search Contacts selected.");
                    System.out.println("Enter the first letter of the last name: ");
                    String searchLetter = scanner.nextLine();

                    DatabaseManager.searchContactsByLastName(searchLetter);

                    break;

                case 6:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please select a number from 1 through 6."
                    );
            }

        } while (choice != 6);

        scanner.close();
    }
}