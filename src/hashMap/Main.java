package hashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<String> listWithCities = new ArrayList<>();
//        listWithCities.add("Warsaw");
//        listWithCities.add("Szczecin");
//        listWithCities.add("Krakow");
//        listWithCities.add("Poznan");
//
//       Iterator<String> iterator1 = listWithCities.iterator();
//       ListIterator<String> iterator2 = listWithCities.listIterator();
//
//       while(iterator1.hasNext()){
//           System.out.println(iterator1.next());
//       }
//
//        System.out.println();
//
//       while(iterator2.hasNext()){
//           System.out.println(iterator2.next());
//       }

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Kacper");
        myMap.put(2, "Hania");
        Set<Map.Entry<Integer, String>> entries = myMap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        String[] myArray = {"One", "Two", "Three", "Four"};
        List<String> newList = new ArrayList<>(List.of(myArray));

        System.out.println(myArray);
        System.out.println(newList);


    }

}
