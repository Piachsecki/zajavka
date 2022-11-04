package static_zadania.ex2;

public class Static {
    private String name;

    public static  int counter = 0;

    public String getName() {
        return name;
    }

    public Static(String name) {
        System.out.println("Constructor called");
        this.name = name;
        counter++;
    }
}
