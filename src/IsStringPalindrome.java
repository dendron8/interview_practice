import java.util.*;

public class IsStringPalindrome {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        System.out.println("is word palindrome? : " + isWordPalindrome(word));
    }

    private static boolean isWordPalindrome(String word) {
        String reverseWord = getReverseWord(word);
        System.out.println(reverseWord);
        if (word.equals(reverseWord)) return true;
        return false;
    }

    private static String getReverseWord(String word) {
        System.out.println(word);
        if (word == null || word.isEmpty()) return word;
        return word.charAt(word.length() - 1) + getReverseWord(word.substring(0, word.length() - 1));
    }

}
