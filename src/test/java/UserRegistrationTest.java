import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    //TEST CASE FOR VALID FIRST NAME
    UserRegistration userRegistration=new UserRegistration();
    String [] inputValidEmail={"abc@yahoo.com",
                                "abc-100@yahoo.com",
                                "abc.100@yahoo.com",
                                "abc111@abc.com",
                                "abc-100@abc.net",
                                "abc.100@abc.com.au",
                                "abc@1.com",
                                "abc@gmail.com.com",
                                "abc+100@gmail.com"};

    String [] inputInvalidEmail={"abc","abc@.com.my",
                                "abc123@gmail.a",
                                "abc123@.com",
                                "abc123@.com.com",
                                ".abc@abc.com",
                                "abc()*@gmail.com",
                                "abc@%*.com",
                                "abc..2002@gmail.com",
                                "abc.@gmail.com",
                                "abc@abc@gmail.com",
                                "abc@gmail.com.1a",
                                "abc@gmail.com.aa.au"};

    @Test
    public void givenFirstName_WhenValid_ThenReturn() {
        boolean result = userRegistration.validateFirstLastName("Nilesh");
        Assert.assertTrue(result);
    }
    //TEST CASE FOR INVALID FIRST NAME
    @Test
    public void givenFirstName_WhenInValid_ThenReturn() {
        boolean result=userRegistration.validateFirstLastName("nilesh");
        Assert.assertFalse(result);
    }
    //TEST CASE FOR VALID LAST NAME
    @Test
    public void givenLasName_WhenValid_ThenReturn() {
        boolean result = userRegistration.validateFirstLastName("Patil");
        Assert.assertTrue(result);
    }
    //TEST CASE FOR INVALID LAST NAME
    @Test
    public void givenLastName_WhenInValid_ThenReturn() {
        boolean result = userRegistration.validateFirstLastName("patil");
        Assert.assertFalse(result);
    }
    //TEST CASE FOR VALID EMAIL ID
    @Test
    public void givenEmail_WhenValid_ThenReturn() {
        for (int index=0;index<inputValidEmail.length;index++) {
            boolean result = userRegistration.validateEmail(inputValidEmail[index]);
            System.out.println(inputValidEmail[index]+" : "+result);
            Assert.assertTrue(result);
        }
    }
    //TEST CASE FOR INVALID EMAIL ID
    @Test
    public void givenEmail_WhenInvalid_ThenReturn() {
        for (int index=0;index<inputInvalidEmail.length;index++) {
            boolean result = userRegistration.validateEmail(inputInvalidEmail[index]);
            System.out.println(inputInvalidEmail[index]+" : "+result);
            Assert.assertFalse(result);
        }
    }
    //TEST CASE FOR VALID MOBILE NUMBER
    @Test
    public void givenMobileNumber_WhenValid_ThenReturn() {
        boolean result = userRegistration.validateMobileNumber("91 9876543210");
        Assert.assertTrue(result);
    }
    //TEST CASE FOR INVALID MOBILE NUMBER
    @Test
    public void givenMobileNumber_WhenInvalid_ThenReturn() {
        boolean result = userRegistration.validateMobileNumber("91 987654321");
        Assert.assertFalse(result);
    }
    //TEST CASE FOR VALID PASSWORD WITH:
    //MINIMUM 8 CHARACTERS
    //AT LEAST 1 UPPER CASE CHARACTER
    @Test
    public void givenPassword_WhenValid_ThenReturn() {
        boolean result = userRegistration.validatePassword("NeverGiveUp46");
        Assert.assertTrue(result);
    }
    //TEST CASE FOR INVALID PASSWORD
    @Test
    public void givenPassword_WhenInvalid_ThenReturn() {
        boolean result = userRegistration.validatePassword("nevergiveup46");
        Assert.assertFalse(result);
    }
}
