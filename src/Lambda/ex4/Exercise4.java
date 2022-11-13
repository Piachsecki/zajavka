package Lambda.ex4;

public class Exercise4 implements MyInterface{
    @Override
    public String method3(int myFirstInt, int mySecondInt, String myString) {
        return "Letter on index: " + myFirstInt + " is: "
                + myString.charAt(myFirstInt)
                + " and letter on index: "
                + mySecondInt + " is: "
                +myString.charAt(mySecondInt);
    }
}
