import UserRegistration_20.Demo;
import UserRegistration_20.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class TestCases {

    @RunWith(Parameterized.class)
            public class addMEmail{
                    Object sample;
                    public addMEmail(Object getSample){
                        this.sample=getSample;
                    }
    }

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
    @Test
    public void TestPassword(){
        Assert.assertEquals(true,user.Checkpassword("A2345678%"));
    }


    @Parameterized.Parameters
    public static Collection squreData(){
            return Arrays.asList(new Object[]{
                    {"true" , "arpit@gmail.com"};
                    {"true" , "arpit@gmail.com";}
            });
    }


}
