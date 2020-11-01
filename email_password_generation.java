import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int DEFAULTPASSWORDLENGTH = 10;
    private String department;
    private String emailId;
    private String alternateEmail;
    private String DOMAIN = "matsys.com";

    public Email(String first_name, String last_name) {
        this.set_first_name(first_name);
        this.set_last_name(last_name);
        this.generate_email();
        this.generate_password();
    }

    public void set_first_name(String first_name) {
        this.firstName = first_name;
    }

    public String get_first_name() {
        return this.firstName;
    }

    public void set_last_name(String last_name) {
        this.last_name = last_name;
    }

    public String get_last_name() {
        return this.last_name;
    }

    private void generate_email() {
        firstName = this.get_first_name();
        lastName = this.get_last_name();
        this.emailId = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + "." + this.DOMAIN;
    }

    public String get_email() {
        return this.emailId;
    }

    private void generate_password() {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&";
        char[] password = new char[this.DEFAULTPASSWORDLENGTH];
        for (int i = 0; i < length; i++) {
            int random_value = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random_value);
        }
        this.password = new String(password);
    }

    public String get_password() {
        return this.password;
    }

    public static void main(String[] args) {
        email_obj = new Email("Matru", "Sahu");
        String email = email_obj.get_email();
        String password = email_obj.get_password();
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}