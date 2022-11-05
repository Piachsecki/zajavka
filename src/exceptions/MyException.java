package exceptions;

public class MyException extends Exception implements MyInterface{
    public MyException(String message) {
        super(message);
    }

    public MyException() {
    }

    @Override
    public void method() throws RuntimeException {

    }
}
