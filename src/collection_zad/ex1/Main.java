package collection_zad.ex1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("elem1");
        mySet.add("elem2");
        mySet.add("elem3");
        mySet.add("elem4");
        mySet.add("elem5");
        mySet.add("elem6");
        Iterator<String> iterator = mySet.iterator();

        while(iterator.hasNext()){

            System.out.print(iterator.next());
        }
    }
}
