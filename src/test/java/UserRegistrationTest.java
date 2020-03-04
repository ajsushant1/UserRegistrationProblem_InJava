import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    //TEST CASE FOR VALID FIRST NAME
    UserRegistration userRegistration=new UserRegistration();
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
}
