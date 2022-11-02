package static_lesson;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.staticMethoooood();
        staticMethoooood();
//        nonStatic();
        main.nonStatic();
    }

    public static void staticMethoooood(){
        System.out.println("Static Example");
    }
    public void nonStatic(){
        System.out.println("Not static example");
    }

}
