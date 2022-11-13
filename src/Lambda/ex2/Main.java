package Lambda.ex2;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = (myInt, myString) -> {
            System.out.print("Rest of word letters starting from index: " + myInt + " are: ");
            return myString.substring(myInt);
        };

        System.out.println(myInterface.method2(2, "Kacper"));
    }
}
