import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,2,2,2,3,3,3,4,4,4,5,5};
        Set<Integer> set = new LinkedHashSet<>();
        for (int number : numbers) {
            set.add(number);
        }
        System.out.println(Arrays.toString(set.toArray(new Integer[set.size()])));
    }
}