package Lambda.ex1;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = myInt -> {
            System.out.println("Doing the 1st exercise !");
            return "The int given is : " + myInt;
        };

        System.out.println(myInterface.method1(1274));


    }
}
