import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("0 1");
        printFibonacci(0,1, Integer.parseInt(in.nextLine()));
    }

    private static void printFibonacci(int one, int two, int inboundNumber) {
        if (inboundNumber == 0) return;
        System.out.println(one + two + " ");
        printFibonacci(two, one + two, --inboundNumber);
    }
}