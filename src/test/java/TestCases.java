import UserRegistration_20.Demo;
import UserRegistration_20.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    UserRegistration user =new UserRegistration();
    @Test
    public void addTest(){
        Assert.assertEquals(true,user.firstName("arp"));
    }



}
