import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());
        int factorial = 1;
        for (int i=1; i<number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}