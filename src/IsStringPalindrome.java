import java.util.Scanner;

public class IsStringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(isWordPalindrome(word));
    }

    private static boolean isWordPalindrome(String word) {
        String reverseWord = getReverseWord(word);
        if (word.equals(reverseWord)) return true;
        return false;
    }

    private static String getReverseWord(String word) {
        if (word == null || word.isEmpty()) return word;
        return word.charAt(word.length()-1) + getReverseWord(word.substring(0,word.length()-1));
    }
}