public class ThrowCustomException {

    public static void main(String[] args) throws CustomException {
        throw new CustomException(args[0]);
    }
}


