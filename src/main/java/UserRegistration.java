import java.util.regex.Pattern;

public class UserRegistration {
    //PATTERN FOR FIRST NAME
    public String firstAndLastNamePattern="^[A-Z][a-zA-z]{2,}$";

    //METHOD TO VALIDATE FIRST NAME OF USER
    public boolean validateFirstLastName(String firstOrLastName) {
        return (Pattern.matches(firstAndLastNamePattern,firstOrLastName));
    }
    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO USER REGISTRATION /**************************/");

    }
}
