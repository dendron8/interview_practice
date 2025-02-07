import java.io.*;
import java.util.*;
import java.util.regex.*;
public class IsUserNameValid {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int userNames = s.nextInt();
        s.nextLine();
        for (int i=0; i<userNames; i++) {
            String userName = s.nextLine();
            System.out.println(userName.length() >= 8);
            System.out.println(userName.length() <= 30);
            System.out.println(userName.matches("[\\w]"));
            System.out.println(Character.isAlphabetic(userName.charAt(0)));
            if (userName.length() >= 8 && userName.length() <= 30 &&
                    userName.matches("[\\w]") &&
                    Character.isAlphabetic(userName.charAt(0))) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}