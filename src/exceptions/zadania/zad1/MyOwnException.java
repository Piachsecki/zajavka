package exceptions.zadania.zad1;

public class MyOwnException extends MyException {

    public MyOwnException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyOwnException() {
    }

    public MyOwnException(String message) {
        super(message);
    }
}
