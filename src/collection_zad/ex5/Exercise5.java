package collection_zad.ex5;

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        int x = 11;
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int int_random = random.nextInt(x);
            myList.add(i, int_random);
        }
        System.out.println(myList);

        Map<Integer, Integer> myMap = new HashMap<>();
        for (Integer integer : myList) {
            Integer frequency = myMap.get(integer);
            myMap.put(integer, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(myMap);

    }
}
