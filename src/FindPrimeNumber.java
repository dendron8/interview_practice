public class FindPrimeNumber {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean isPrime = true;
        for (int i=2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}
