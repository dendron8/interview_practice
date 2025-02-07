public class FindLargestInArray {
    public static void main(String[] args) {
        int[] numbers = {5,3,4,5,6,7,8,9,2};
        int largest = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}