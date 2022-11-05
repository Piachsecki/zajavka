package exceptions.zadania.zad1;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try{
            exercise1();

        }catch(MyException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Calling finally");
        }
    }



    public static void exercise1() throws MyException {
        System.out.println("1st exercise");
        throw new MyException();
    }
}
