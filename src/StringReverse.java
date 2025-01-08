public class StringReverse {

    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder builder = new StringBuilder(str);
        System.out.println(builder.reverse().toString());
    }


}
