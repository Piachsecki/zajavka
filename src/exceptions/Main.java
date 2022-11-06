package exceptions;

public class Main {
    public static void main(String[] args) throws MyException {
        try{
            printingEx1("throws");
        }catch(MySubSubException e){
            System.out.println("MySubSubException");
        }catch(MySubException e){
            System.out.println("MySubSubException");
        }catch(MyException e) {
            System.out.println("MySubSubException");
        }
    }

    private static void printingEx1(String input) throws MyException {
        System.out.println("printingEx1");
        printingEx2(input);
        System.out.println("printingEx12");
    }

    private static void printingEx2(String input) throws MyException {
        System.out.println("printingEx2");
        printingEx3(input);
        System.out.println("printingEx22");
    }

    private static void printingEx3(String input) throws MyException {
        System.out.println("printingEx3");
        printingEx4(input);
        System.out.println("printingEx33");
    }

    private static void printingEx4(String input) throws MyException {
        System.out.println("printingEx4");
        if("throws".equalsIgnoreCase(input)){
            throw new MySubException();
        }
        System.out.println("printingEx44");
    }
}
