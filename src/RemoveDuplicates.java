import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] numbers = {1,2,2,4,4,6,6,8,8,12};
        Set<Integer> set = new LinkedHashSet<Integer>();
        for (int number : numbers) {
            set.add(number);
        }
        System.out.println(Arrays.toString(set.toArray(new Integer[set.size()])));
    }
}
