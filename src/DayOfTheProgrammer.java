import java.io.*;

import static java.util.stream.Collectors.joining;

class Result5 {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        int dayOfYear = 0;
        int jan = 31;
        int mar = 31;
        int apr = 30;
        int may = 31;
        int jun = 30;
        int jul = 31;
        int aug = 31;
        int sep = 30;

        dayOfYear += jan;
        if (year >= 1918) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                //its a leap year
                if (year == 1918) dayOfYear += 16;
                else dayOfYear += 29;
            } else {
                //its not a leap year
                if (year == 1918) dayOfYear += 15;
                else dayOfYear += 28;
            }

        } else if (year < 1918) {
            if (year % 4 == 0) {
                dayOfYear += 29;
            } else dayOfYear += 28;
        }
        dayOfYear += mar + apr + may + jun + jul + aug;
        int daysLeft = 256 - dayOfYear;
        return daysLeft + ".09." + year;
    }
}
public class DayOfTheProgrammer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result5.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
