import java.util.*;
import java.lang.*;


class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
        int attempt=0;
        while(attempt != 3){
            if(user == userId && pass == password){
                return "Welcome "+user;
            }
            else if(user != userId || pass != password){
                attempt++;
                return "You have entered wrong credentials ,please enter the right credentials.";
            }
        }

            return "You have entered wrong credentials 3 times\n" +"\n" +"Contact Admin\n" ;


    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
        String username , password;
        Scanner src = new Scanner(System.in);
        username = src.nextLine();
        password = src.nextLine();
        System.out.println(new Login().loginuser(username,password));
    }
}

