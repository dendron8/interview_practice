public class FindLargestInArray {

    public static void main(String[] args) {
        int[] numbers = {1,3,5,7};
        int largest = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("largest number is " + largest);
    }
}
