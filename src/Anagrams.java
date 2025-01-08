import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        if (first.length() == second.length()) {
            char[] firstArray = first.toCharArray();
            char[] secondArray = second.toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            System.out.println(Arrays.equals(firstArray, secondArray));
        }
    }
}
