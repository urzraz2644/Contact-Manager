// Name: Urzalla Razmowar
// Date: 08/23/2026
// Purpose: Managers the SQLite database connection for the Rolodex Contacts Application.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseManager {

    private static  final String URL = "jdbc:sqlite:contacts.db";

    public static Connection connect() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL);
            System.out.println("Connected to SQLite database.");
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }

        return connection;
        
    }

    public static void createTable() {

        String sql = "CREATE TABLE IF NOT EXISTS contacts (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "contactType TEXT NOT NULL, " +
                "firstName TEXT NOT NULL, " +
                "lastName TEXT NOT NULL, " +
                "phoneNumber TEXT, " +
                "email TEXT, " +
                "street TEXT, " +
                "city TEXT, " +
                "state TEXT, " +
                "zipCode TEXT, " +
                "relationship TEXT, " +
                "company TEXT" +
                ");";

            try (Connection connection = connect();
                Statement statement = connection.createStatement()) {

                statement.execute(sql);
                System.out.println("Contacts table is ready.");

            } catch (SQLException e) {
                System.out.println("Table creation error: " + e.getMessage());
            }
    }

    public static void addContact(
            String contactType,
            String firstName,
            String lastName,
            String phoneNumber,
            String email,
            String street,
            String city,
            String state,
            String zipCode,
            String relationship,
            String company) {

        String sql = "INSERT INTO contacts " +
                "(contactType, firstName, lastName, phoneNumber, email, street, city, state, zipCode, relationship, company) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(sql)) {

                statement.setString(1, contactType);
                statement.setString(2, firstName);
                statement.setString(3, lastName);
                statement.setString(4, phoneNumber);
                statement.setString(5, email);
                statement.setString(6, street);
                statement.setString(7, city);
                statement.setString(8, state);
                statement.setString(9, zipCode);
                statement.setString(10, relationship);
                statement.setString(11, company);

                statement.executeUpdate();
                System.out.println("Contact added to database.");

            } catch (SQLException e) {
                System.out.println("Add contact error: " + e.getMessage());
            }       

            }

            public static void displayAllContacts() {

                String sql = "SELECT * FROM contacts"; 

                try (Connection connection = connect();
                    Statement statement = connection.createStatement();
                    ResultSet results = statement.executeQuery(sql)) {
                    
                    System.out.println();
                    System.out.println("Contacts Stored in Database");
                    System.out.println("---------------------------");

                    while (results.next()) {
                        System.out.println("ID: " + results.getInt("id"));
                        System.out.println("Type: " + results.getString("contactType"));
                        System.out.println("Name: " +
                                results.getString("firstName") + " " +
                                results.getString("lastName"));
                        System.out.println("Phone: " + results.getString("phoneNumber"));
                        System.out.println("Email: " + results.getString("email"));
                        System.out.println("Address: " +
                                results.getString("street") + ", " +
                                results.getString("city") + ", " +
                                results.getString("state") + ", " +
                                results.getString("zipCode"));
                        System.out.println("Relationship: " + results.getString("relationship"));
                        System.out.println("Company: " + results.getString("company"));
                        System.out.println();
                    }

                    } catch (SQLException e) {
                        System.out.println("Read contact error: " + e.getMessage());
                    }
            }

            public static void updateContact(int id, String phoneNumber, String email) {
                
                String sql = "UPDATE contacts SET phoneNumber = ?, email = ? WHERE id = ?";

                try (Connection connection = connect();
                    PreparedStatement statement = connection.prepareStatement(sql)) {

                    statement.setString(1, phoneNumber);
                    statement.setString(2, email);
                    statement.setInt(3, id);
                    statement.executeUpdate();
                    System.out.println("Contact updated in database.");
                    
                } catch (SQLException e) {
                    System.out.println("Update contact error: " + e.getMessage());
                }

                }

                public static void deleteContact(int id) {
                    String sql = "DELETE FROM contacts WHERE id = ?";

                    try (Connection connection = connect();
                    PreparedStatement statement = connection.prepareStatement(sql)) {
                        
                        statement.setInt(1, id);
                        statement.executeUpdate();

                        System.out.println("Contact deleted from database.");
                    
                    } catch (SQLException e) {
                        System.out.println("Delete contact error: " + e.getMessage());
                    }
                }
        }
