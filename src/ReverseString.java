public class ReverseString {

    public static void main(String[] args) {
        String startString = args[0];
        int i = 0;
        int j = startString.length()-1;
        char[] reverseString = new char[j+1];
        while (i<=j) {
            reverseString[i] = startString.charAt(j);
            reverseString[j] = startString.charAt(i);
            i++;
            j--;
        }
        System.out.println("here it is: " + String.valueOf(reverseString));
    }
}
