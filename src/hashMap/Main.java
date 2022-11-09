package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap();
        myMap.put(1, "Kacper");
        myMap.put(2, "Hania");
        myMap.put(3, "Piotrek");
        myMap.put(4, "Wiktor");
        System.out.println(myMap);
        System.out.println(myMap.get(1));
        Car car1 = new Car(2020, "BMW", "M3");
        Car car2= new Car(2021, "Audi", "RS7");
        Car car3 = new Car(2022, "Mercedes", "GLC");
        Map<Car, String> carsMap = new HashMap<>();
        carsMap.put(car1, "good caar");
        carsMap.put(car2, "bad caar");
        carsMap.put(car3, "so so caar");
        System.out.println(carsMap);

        System.out.println(carsMap.containsKey(new Car(2020, "BMW", "M3")));
        System.out.println(carsMap.containsValue("good caar"));
        Set<Car> cars = carsMap.keySet();
        System.out.println(cars);
        Collection<String> values = carsMap.values();
        System.out.println(values);

    }

}
