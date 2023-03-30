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
        try {
            Assert.assertEquals(true, user.firstName("Gulha2ne"));
        }catch (Exception ex){
            System.out.println("Invalid First name");
        }
    }
    @Test
    public void TestLastName(){
        try {
        Assert.assertEquals(true,user.LastName("Arpitt"));
        }catch (Exception ex){
            System.out.println("Invalid Last name");
        }
    }
    @Test
    public void TestEmail(){
        try {
        Assert.assertEquals(true,user.ValidEmail("arpit@gmail.com"));
        }catch (Exception ex){
            System.out.println("Invalid Email");
        }
    }
    @Test
    public void TestNumber(){
        try {
        Assert.assertEquals(true,user.numberFormat("91 9284530926"));
        }catch (Exception ex){
            System.out.println("Invalid Numver");
        }
    }
    @Test
    public void TestPassword(){
        try {
        Assert.assertEquals(true,user.Checkpassword("A2345678%"));
        }catch (Exception ex){
            System.out.println("Invalid password");
        }
    }


//    @Parameterized.Parameters
//    public static Collection squreData(){
//            return Arrays.asList(new Object[]{
//                    {"true" , "arpit@gmail.com"};
//                    {"true" , "arpit@gmail.com";}
//            });
//    }


}
