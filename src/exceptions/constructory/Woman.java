package exceptions.constructory;

public class Woman extends Person{
    public Woman(int age, String name) {
        super(age, name);
    }

    public Woman(String name) {
        super(name);
    }

    public Woman(int age) {
        super(age);
    }
}
