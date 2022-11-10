package collection_zad.ex6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(1);
        Square square2 = new Square(2);
        Square square3 = new Square(3);
        Square square4 = new Square(4);
        Square square44 = new Square(4);
        Square square5 = new Square(5);
        Square square6 = new Square(6);
        Square square66 = new Square(6);
        List<Square> myList = new ArrayList<>();
        myList.add(square3);
        myList.add(square1);
        myList.add(square2);
        myList.add(square4);
        myList.add(square5);
        myList.add(square6);
        myList.add(square44);
        myList.add(square66);
        Set<Square> listWithoutDuplicates = new HashSet<>(myList);
        System.out.println(listWithoutDuplicates);
        System.out.println(myList);







//        int temp;
//        List<Square> listOfDuplicates = new ArrayList<>();
//        for (int i = 0; i < myList.size(); i++) {
//            for (int j = i+1; j <= myList.size() -1 ; j++) {
//
//                if (myList.get(i).equals(myList.get(j)) ) {
//                    listOfDuplicates.add(myList.get(i));
//                }
//            }
//        }
//
//        System.out.println(myList);
//        System.out.println(listOfDuplicates);
//        myList.remove(listOfDuplicates.get(0));
//        myList.remove(listOfDuplicates.get(1));
//        System.out.println(myList);
    }
}
