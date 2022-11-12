package collection_zad.ex8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Map<Integer, String> myDziennik = new HashMap<>();
//        myDziennik.put(1, "Kacper Kacperski");
//        myDziennik.put(2, "Kaja Piasecka");
//        myDziennik.put(3, "Lena Miticzky");
//        myDziennik.put(4, "Maciejo Kosciinski");
//        myDziennik.put(5, "Piotrek Pawlak");
//        myDziennik.put(6, "Kacper Kuzmicki");
//        myDziennik.put(7, "Hania Hanna");
//        System.out.println(method(myDziennik, 2, 7));
        Set<Integer> mySet = new HashSet<>();
        mySet.add(null);
        System.out.println(mySet);
    }

    private static List<String> method(Map<Integer, String> myDziennik, int a, int b) {
        List<String> names = new ArrayList<>();
        for (Map.Entry<Integer, String> integerStringEntry : myDziennik.entrySet()) {
            if(integerStringEntry.getKey() >= a && integerStringEntry.getKey() < b){
                names.add(integerStringEntry.getValue());
            }
        }


        return names;
    }


}
