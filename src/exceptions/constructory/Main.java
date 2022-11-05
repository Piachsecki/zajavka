package exceptions.constructory;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person( 17, "Marek");
        try {
            person1.setAge(1);
        }catch (TooYoungException e){
            System.out.println(e.getMessage());
        }
    }
}
