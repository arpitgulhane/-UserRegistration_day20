package UserRegistration_20;

import java.util.regex.Pattern;

public class UserRegistration {

    public static Object firstName(String name){

        boolean result = Pattern.matches("[A-Za-z]{3,10}", name);
        return result;
    }

    public static void main(String[] args) {
        boolean result = Pattern.matches("[A-Za-z]{3,10}", "GOOD");
        boolean LastName = Pattern.matches("[A-Za-z]{3,10}", "Gulhane");
        System.out.println("Given input is RIGHT ? \n"+result);
        System.out.println("LastName is Valid ? \n"+LastName);

        boolean Email = Pattern.matches("[a-zA-Z0-9]+[@][a-z]+[.][a-z]{2,}", "arpit99@microsoft.in");
        System.out.println("Email is Valid ? \n"+Email);

        boolean Number = Pattern.matches("[91 ]+[0-9]{10}", "91 9284530926");
        System.out.println("Number is Valid ? \n"+Number);

        boolean Password = Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}", "A2345678%");
        System.out.println("Password is Valid ? \n"+Password);
    }
}
