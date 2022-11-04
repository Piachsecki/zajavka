package static_zadania.ex3;

public class Child extends AParent{
    @Override
    String getName() {
        return super.getName();
    }
    static String getClassName(){

        return "Child";
    }
}
