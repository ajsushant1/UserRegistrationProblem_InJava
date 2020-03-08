import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    //TEST CASE FOR VALID FIRST NAME
    UserRegistration userRegistration=new UserRegistration();
    boolean result;
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
    public void givenFirstNameWithCapital_WhenValid_ThenReturnTrue() {
        result = userRegistration.validateFirstLastName("Nilesh");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstWithNameAllCapital_WhenValid_ThenReturnTrue() {
        result=userRegistration.validateFirstLastName("NILESH");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameWithMinimumLength_WhenValid_ThenReturnTrue() {
        result=userRegistration.validateFirstLastName("Nil");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameWithNumber_WhenInValid_ThenReturnFalse() {
        result=userRegistration.validateFirstLastName("Nilesh1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstNameWithoutFirstLetterCapital_WhenInValid_ThenReturnFalse() {
        result=userRegistration.validateFirstLastName("nilesh");
        Assert.assertFalse(result);

    }

    @Test
    public void givenFirstNameWithLessThanMinimumLength_WhenInValid_ThenReturnFalse() {
        result=userRegistration.validateFirstLastName("Ni");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLasName_WhenValid_ThenReturnFalse() {
        result = userRegistration.validateFirstLastName("Patil");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameWithAllCapitalLatter_WhenValid_ThenReturnTrue() {
        result = userRegistration.validateFirstLastName("PATIL");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameWithMinimumLength_WhenValid_ThenReturnTrue() {
        result=userRegistration.validateFirstLastName("Roy");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInValid_ThenReturnFalse() {
        result = userRegistration.validateFirstLastName("patil");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameWithNumber_WhenInValid_ThenReturnFalse() {
        result=userRegistration.validateFirstLastName("Patil2");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameWithLessThanMinimumLength_WhenInValid_ThenReturnFalse() {
        result=userRegistration.validateFirstLastName("Pa");
        Assert.assertFalse(result);
    }

    @Test
    public void givenValidEmails_WhenValid_ThenReturnTrue() {
        for (String validEmail:inputValidEmail) {
            result = userRegistration.validateEmail(validEmail);
            Assert.assertTrue(result);
        }
    }

    @Test
    public void givenInvalidEmail_WhenInvalid_ThenReturn() {
        for (String invalidEmail:inputInvalidEmail) {
            result = userRegistration.validateEmail(invalidEmail);
            Assert.assertFalse(result);
        }
    }

    @Test
    public void givenMobileNumber_WhenValid_ThenReturnTrue() {
        result = userRegistration.validateMobileNumber("91 9876543210");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumberWithLessThanFixSize_WhenInvalid_ThenReturnFalse() {
        result = userRegistration.validateMobileNumber("91 987654321");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumberWithoutCountryCode_WhenInvalid_ThenReturnFalse() {
        result = userRegistration.validateMobileNumber("9876543210");
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD WITH:
    //MINIMUM 8 CHARACTERS
    //AT LEAST 1 UPPER CASE CHARACTER
    //AT LEAST 1 NUMERIC NUMBER
    //EXACTLY 1 SPECIAL CHARACTER
    @Test
    public void givenPasswordWithAllRules_WhenValid_ThenReturnTrue() {
        result = userRegistration.validatePassword("NeverGiveUp#46");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordStartWithSpecialCharacter_WhenValid_ThenReturnTrue() {
        result = userRegistration.validatePassword("#NeverGiveUp46");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWithMinimumLength_WhenValid_ThenReturnTrue() {
        result = userRegistration.validatePassword("Qwerty1#");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordStartWithNumber_WhenValid_ThenReturnTrue() {
        result = userRegistration.validatePassword("46NeverGiveUp#");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWithoutUpperCaseLatter_WhenInvalid_ThenReturnFalse() {
        result = userRegistration.validatePassword("evergiveup46");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithoutSpecialCharacter_WhenInvalid_ThenReturnFalse() {
        result = userRegistration.validatePassword("NeverGiveUp46");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithoutNumber_WhenInvalid_ThenReturnFalse() {
        result = userRegistration.validatePassword("NeverGiveUp#");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithLessThanMinimumLength_WhenInvalid_ThenReturnFalse() {
        result = userRegistration.validatePassword("Never1#");
        Assert.assertFalse(result);
    }
}
