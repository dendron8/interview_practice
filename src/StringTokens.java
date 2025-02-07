import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] tokens = input.split("[^a-zA-Z0-9]+");
        List<String> list = new ArrayList<>(Arrays.asList(tokens));
        List<String> newlist = new ArrayList<>();
        Iterator<String> it = list.iterator();
        while (it.hasNext())
        {
            String token = it.next();
            if (token != null && !token.isEmpty())
            {
                newlist.add(token);
            }
        }

        System.out.println(newlist.size());
        for (int i=0; i<newlist.size(); i++) {
            System.out.println(newlist.get(i).replace(",", "").replace("?", "").replace("!", "").replace(".", "").replace("@", "").replace("_", ""));
        }
    }
}