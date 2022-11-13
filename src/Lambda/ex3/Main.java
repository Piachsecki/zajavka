package Lambda.ex3;

import Lambda.ex3.MyInterface;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = (myFirstInt, mySecondInt, myString) ->{
            System.out.println("Doing the 3rd exercise !");

            return "Letter on index: " + myFirstInt + " is: "
            + myString.charAt(myFirstInt)
            + " and letter on index: "
            + mySecondInt + " is: "
            +myString.charAt(mySecondInt);
        };

        System.out.println(myInterface.method3(2, 3, "Kacper jest turbo przystojny!"));

    }
}
