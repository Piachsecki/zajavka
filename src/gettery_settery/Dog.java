package gettery_settery;

public abstract class Dog extends Animal{

    @Override
    void giveVoice() {
        System.out.println("WOOOF");
    }

    public Dog() {
        super();

    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }

    @Override
    public void eat(){
        System.out.println("blabla bla");



    }
}
