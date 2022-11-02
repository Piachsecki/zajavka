package static_lesson;

public class Dog extends Animal {
    public static final int numberOfLegs = 4;
    private static String name = "kacper";
    public static int numberOfDogsCreated = 0;

    public void nonStaticMethod(){
        this.name = "sss";
        System.out.println("Non static method");
    }

    public Dog() {
        numberOfDogsCreated++;
    }

    public static void staticMethod(){
        System.out.println("Static method");
    }
    @Override
    public void giveSound() {
        System.out.println("Hau");
    }
}
