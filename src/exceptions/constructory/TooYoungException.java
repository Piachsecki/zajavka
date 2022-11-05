package exceptions.constructory;

public class TooYoungException extends RuntimeException{
    public TooYoungException() {
        System.out.println("You are too young !");
    }
}
