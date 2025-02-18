import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MaxKeyboardDrive {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        //b is budget
        int max = -1;
        for (int i=0; i<keyboards.length; i++) {
            int k = keyboards[i];
            System.out.println(k);
            //if (k > b) return -1;
            for (int j=0; j<drives.length; j++) {
                int d = drives[j];
                System.out.println(d);
                if (k+d <= b && k+d > max) max=k+d;
            }
        }
        return max;
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        //System.out.println(next);
        String[] bnm = next.split(" ");

        int b = Integer.parseInt(bnm[0]);
        //System.out.println(b);
        int n = Integer.parseInt(bnm[1]);
        //System.out.println(n);
        int m = Integer.parseInt(bnm[2]);
        //System.out.println(m);
        int[] keyboards = new int[n];

        String next2 = scanner.nextLine();
        //System.out.println(next2);
        String[] keyboardsItems = next2.split(" ");
        //System.out.println(keyboardsItems.length);
        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            //System.out.println(keyboardsItem);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            //System.out.println(drivesItem);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */
        System.out.println("call get money spent");
        int moneySpent = getMoneySpent(keyboards, drives, b);

        System.out.println(String.valueOf(moneySpent));

        scanner.close();
    }
}
