public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int DEFAULTPASSWORDLENGTH = 10;
    private String emailId;
    private String DOMAIN = "matsys.com";

    public Email(String first_name, String last_name) {
        set_first_name(first_name);
        set_last_name(last_name);
        generate_email();
        generate_password();
    }

    public void set_first_name(String first_name) {
        firstName = first_name;
    }

    public String get_first_name() {
        return firstName;
    }

    public void set_last_name(String last_name) {
        lastName = last_name;
    }

    public String get_last_name() {
        return lastName;
    }

    private void generate_email() {
        firstName = get_first_name();
        lastName = get_last_name();
        emailId = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + "." + DOMAIN;
    }

    public String get_email() {
        return emailId;
    }

    private void generate_password() {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&";
        char[] password_array = new char[DEFAULTPASSWORDLENGTH];
        for (int i = 0; i < DEFAULTPASSWORDLENGTH; i++) {
            int random_value = (int) (Math.random() * passwordSet.length());
            password_array[i] = passwordSet.charAt(random_value);
        }
        password = new String(password_array);
    }

    public String get_password() {
        return password;
    }

    public static void main(String[] args) {
        Email email_obj = new Email("Matru", "Sahu");
        String email = email_obj.get_email();
        String password = email_obj.get_password();
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}