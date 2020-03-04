import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    //TEST CASE FOR VALID FIRST NAME
    @Test
    public void givenFirstName_WhenValid_ThenReturn() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result = userRegistration.validateFirstName("Nilesh");
        Assert.assertTrue(result);
    }
    //TEST CASE FOR INVALID FIRST NAME
    @Test
    public void givenFirstName_WhenInValid_ThenReturn() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validateFirstName("nilesh");
        Assert.assertFalse(result);
    }
}
