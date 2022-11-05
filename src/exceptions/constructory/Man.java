package exceptions.constructory;

public class Man extends Person{
    public Man(int age, String name) throws RuntimeException {
        super(age, name);
    }

    public Man(String name) {
        super(name);
    }

    public Man(int age) {
        super(age);
    }
}
