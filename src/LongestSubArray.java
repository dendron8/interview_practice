import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        int maxArrayLength = 0;
        for (int i=0; i<a.size(); i++) {
            Integer value = a.get(i);
            int subArrayLengthPlus = 1;
            int subArrayLengthMinus = 1;
            for (int j=0; j<a.size(); j++) {
                int diff = a.get(j) - value;
                if (j != i && (diff == 1 || diff == 0)) {
                    System.out.println("plus j: " + a.get(j) + " value: " + value);
                    subArrayLengthPlus++;
                }
                if (j != i && (diff == -1 || diff == 0)) {
                    System.out.println("minus j: " + a.get(j) + " value: " + value);
                    subArrayLengthMinus++;
                }
                if (subArrayLengthPlus > maxArrayLength) {
                    maxArrayLength = subArrayLengthPlus;
                }
                if (subArrayLengthMinus > maxArrayLength) {
                    maxArrayLength = subArrayLengthMinus;
                }
            }

        }
        return maxArrayLength;
    }

}

public class LongestSubArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result3.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
