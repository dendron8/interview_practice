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

class Result2 {

    /*
     public static String organizingContainers(List<List<Integer>> container) {

        List<Integer> colorSum = new ArrayList<>();
        List<Integer> containerSum = new ArrayList<>();
        //sort the container list based on the comparator
        Collections.sort(container, Comparator.comparing(list -> list.stream().reduce(0, (a, b) -> a + b)));

        for (int i = 0; i < container.size(); i++) {
                int sum = 0;
                for (int j = 0; j < container.get(i).size(); j++) {
                        sum += container.get(i).get(j);
                        if (colorSum.size() == j) {
                                colorSum.add(container.get(i).get(j));
                        }
                        else {
                                colorSum.set(j, colorSum.get(j) + container.get(i).get(j));
                        }
                }
                containerSum.add(sum);
        }

        Collections.sort(containerSum);
        Collections.sort(colorSum);

        if (!containerSum.equals(colorSum)) {
                return "Impossible";
        }

        return "Possible";
}

}
     */

    public static String organizingContainers(List<List<Integer>> container) {

        //keep track of the total colored balls
        List<Integer> totalColor = new ArrayList<>();
        //keep track of the total number of container spaces
        List<Integer> totalContainer = new ArrayList<>();
        //sort containers by total number of balls
        Comparator<List<Integer>> comparator = Comparator.comparing(_container -> _container.stream().reduce(0, Integer::sum));
        container.sort(comparator);
        //
        for (int i = 0; i < container.size(); i++) {
            int total = 0;
            List<Integer> subContainer = container.get(i);
            for (int j = 0; j < subContainer.size(); j++) {
                total += subContainer.get(j);
                if (totalColor.size() == j) {
                    //first colored ball match, add to total
                    totalColor.add(subContainer.get(j));
                } else {
                    //add ball count to existing total
                    totalColor.set(j, totalColor.get(j) + subContainer.get(j));
                }
            }
            totalContainer.add(total);
        }
        Collections.sort(totalContainer);
        Collections.sort(totalColor);

        if (totalContainer.equals(totalColor)) return "Possible";
        return "Impossible";
    }

    public class OrganizingContainersOfBalls {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int q = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, q).forEach(qItr -> {
                try {
                    int n = Integer.parseInt(bufferedReader.readLine().trim());

                    List<List<Integer>> container = new ArrayList<>();

                    IntStream.range(0, n).forEach(i -> {
                        try {
                            container.add(
                                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                            .map(Integer::parseInt)
                                            .collect(toList())
                            );
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    });

                    String result = Result2.organizingContainers(container);

                    System.out.println(result);

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();

        }
    }
}
