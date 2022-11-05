package exceptions.zadania.zad2;

import exceptions.MyException;

public class MyExample {
    public static void main(String[] args) {
        try{

            exercise2(7);
        } catch (Exception e){
            System.out.println("There is an exception !!");
        }
    }


    public static void exercise2(int i) throws MyException {
        if(i > 21){
            throw new MyException();
        }
    }
}
