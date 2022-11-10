package collection_zad.ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(4);
        System.out.println(method(myList));
    }


    private static  List<Integer> method(List<Integer> myList){
        int maxValue = myList.get(0);
        for (Integer val : myList) {
            if(val > maxValue){
                maxValue = val;
            }
        }
        List<Integer> secList = new ArrayList<>();
        for (Integer integer : myList) {
            if(integer != maxValue){
                secList.add(integer);
            }
        }
        secList.add(maxValue);


        return secList;
    }

}

