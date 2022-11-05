package exceptions.constructory;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) throws RuntimeException {
        if(age < 18){
            throw new TooYoungException();
        }else{

            this.age = age;
            this.name = name;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) throws TooYoungException {
        if(age < 18){
            throw new TooYoungException();
        }else{
            this.age = age;

        }
    }
}
