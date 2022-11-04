package static_zadania.ex3;

public abstract class AParent {
    private String name = "kutash";
    String getName(){
        return this.name;
    }
    static String getClassName(){
        return "AParent";
    }

}
