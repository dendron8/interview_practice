import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        boolean isPrime = true;
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        System.out.println(isPrime);
    }
}