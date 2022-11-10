package collection_zad.ex7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
     method("Kaaaaccperr");
    }

    private static void method(String sentence) {
        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++){
            Character myChar = sentence.charAt(i);
            Integer myInt = myMap.get(myChar);
            myMap.put(myChar, myInt == null ? 1 : myInt + 1);
        }
        System.out.println(myMap);
    }
}
