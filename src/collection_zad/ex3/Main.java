package collection_zad.ex3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Employee> mySetOfEmployees = new HashSet<>();
        mySetOfEmployees.add(new Employee("Kacper", "Piasecki"));
        mySetOfEmployees.add(new Employee("Wiktor", "Kuzmicki"));
        mySetOfEmployees.add(new Employee("Kacper", "Piasecki"));
        mySetOfEmployees.add(new Employee("Piotrek", "Pawlak"));

        System.out.println(mySetOfEmployees);
    }
}
