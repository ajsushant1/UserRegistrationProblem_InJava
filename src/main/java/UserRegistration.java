import java.util.regex.Pattern;

public class UserRegistration {
    //PATTERN FOR FIRST NAME
    public String firstAndLastNamePattern="^[A-Z][a-zA-z]{2,}$";
    //PATTERN FOR EMAIL ID
    public String emailPattern="^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2,3})?$";
    //PATTERN FOR MOBILE NUMBER
    public String mobileNumberPattern="^[0-9]{2}[ ][0-9]{10}$";
    //PATTERN FOR PASSWORD
    public String passwordPattern="^(?=.*[A-Z])(?=.*?[a-z]).{8,}$";

    //METHOD TO VALIDATE FIRST NAME OR LAST NAME OF USER
    public boolean validateFirstLastName(String firstOrLastName) {
        return (Pattern.matches(firstAndLastNamePattern,firstOrLastName));
    }
    //METHOD TO VALIDATE EMAIL OF USER
    public boolean validateEmail(String email){
        return (Pattern.matches(emailPattern,email));
    }
    //METHOD TO VALIDATE MOBILE NUMBER OF USER
    public boolean validateMobileNumber(String mobileNumber) {
        return(Pattern.matches(mobileNumberPattern,mobileNumber));
    }
    //METHOD TO VALIDATE PASSWORD
    public boolean validatePassword(String password) {
        return(Pattern.matches(passwordPattern,password));
    }
    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO USER REGISTRATION /**************************/");
    }
}
