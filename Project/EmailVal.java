import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailVal {
    public static String validemail(String email){
        if(email == null || email.isEmpty()){
            return "Invalid Email";
        }

        String emailReg = "[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-zA]{2,7}$";
        Pattern pat = Pattern.compile(emailReg);
        if(pat.matcher(email).matches()){
            return "Valid email";
        }else{
            return "Invalid email";
        }

    }
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Enter the email-Id : ");
        String email = scn.nextLine();
        String st = validemail(email);
        System.out.println("your email id is : "+st);
        scn.close();

    }
}
