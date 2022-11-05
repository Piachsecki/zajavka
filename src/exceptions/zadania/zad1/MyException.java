package exceptions.zadania.zad1;

public class MyException extends Exception {


    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException() {
        super("My exception was thrown");
    }

    public MyException(String message) {
        super(message);
    }
}
