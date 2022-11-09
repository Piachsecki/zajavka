package ArrayLista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Kacper");
        list.add("Piotrek");
        list.add("Wiktor");
        list.add("Hania");
        System.out.println(list);
        System.out.println();
        System.out.println(list.contains("Maciek"));
        list.contains("Piotrek");
        System.out.println();
        list.remove("Hania");
        list.remove(0);
        System.out.println(list);
        System.out.println();
        Object[] arr = list.toArray();
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.isEmpty());

    }
}
