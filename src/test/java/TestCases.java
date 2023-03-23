import UserRegistration_20.Demo;
import UserRegistration_20.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    UserRegistration user =new UserRegistration();
    @Test
    public void addTest(){
        Assert.assertEquals(true,user.firstName("Gulhane"));
    }
    @Test
    public void TestLastName(){
        Assert.assertEquals(true,user.LastName("Arpitt"));
    }
    @Test
    public void TestEmail(){
        Assert.assertEquals(true,user.ValidEmail("arpit@gmail.com"));
    }
    @Test
    public void TestNumber(){
        Assert.assertEquals(true,user.numberFormat("91 9284530926"));
    }




}
