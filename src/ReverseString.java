import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String startString = in.nextLine();
        int i = 0;
        int j = startString.length()-1;
        char[] reverseString = new char[j+1];
        while (i<=j) {
            reverseString[i] = startString.charAt(j);
            reverseString[j] = startString.charAt(i);
            i++;
            j--;
        }
        System.out.println(String.valueOf(reverseString));
    }
}