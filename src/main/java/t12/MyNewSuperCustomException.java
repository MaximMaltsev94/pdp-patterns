package t12;

public class MyNewSuperCustomException extends Exception {
    public MyNewSuperCustomException(String message, Throwable cause) {
        super(message, cause);
        System.out.println("inside MyNewSuperCustomException constructor");
    }
}
