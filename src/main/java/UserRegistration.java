import java.util.regex.Pattern;

public class UserRegistration {
    //PATTERN FOR FIRST NAME
    public String firstNamePattern="^[A-Z][a-zA-z]{2,}$";

    //METHOD TO VALIDATE FIRST NAME OF USER
    public boolean validateFirstName(String firstName) {
        return (Pattern.matches(firstNamePattern,firstName));
    }
    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO USER REGISTRATION /**************************/");

    }
}
