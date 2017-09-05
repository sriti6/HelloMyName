
import java.util.Scanner;
public class HelloMyName {
    public static void main(String [] args) {
        //instantiation
      Scanner keyboard = new Scanner(System. in);
        System.out.println("Enter your password");
         int password  = keyboard.nextInt();
         System.out.println("Enter your username" );
         String username = keyboard.next();
        System.out.println("Hello welcome to CSC200 class" + username + ".your password is " + password );
    }
}