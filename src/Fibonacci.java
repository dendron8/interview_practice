public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("0 1 ");
        printFibonacci(0, 1, Integer.parseInt(args[0]));
    }

    private static void printFibonacci(int one, int two, int number) {
        if (number == 0) return;
        System.out.println(one + two + " ");
        printFibonacci(two, one+two, --number);
    }
}
