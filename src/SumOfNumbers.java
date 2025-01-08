public class SumOfNumbers {

    public static void main(String[] args) {
        int result = sum(Integer.parseInt(args[0]));
        System.out.println(result);
    }
    public static int sum(int number) {
        if (number > 0) {
            return number + sum(number - 1);
        } else {
            return 0;
        }
    }
}
