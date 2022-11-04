package static_zadania.ex2;

import static static_zadania.ex2.Static.counter;

public class Main {
    public static void main(String[] args) {
        Static static1 = new Static("A");
        System.out.println(counter);
        System.out.println(static1.getName());

        Static static2 = new Static("B");
        System.out.println(counter);
        System.out.println(static2.getName());
        Static static3 = new Static("C");
        System.out.println(counter);
        System.out.println(static3.getName());
        Static static4 = new Static("D");
        System.out.println(counter);
        System.out.println(static4.getName());
        Static static5 = new Static("E");
        System.out.println(counter);
        System.out.println(static5.getName());
    }
}
