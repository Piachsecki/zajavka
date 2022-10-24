package gettery_settery;

public abstract class Animal {
    private String name;

    private int numberOfLegs;

    abstract void giveVoice();

    public void eat(){
        System.out.println("Animal eating");
    }

}
