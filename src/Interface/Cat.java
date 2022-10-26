package Interface;

public class Cat implements CatStroukable, Voiceable{
    private String name;

    @Override
    public void strokeMe() {
        System.out.println("Its so nice stroking !");
    }

    @Override
    public void giveMeVoice() {
        System.out.println("Meow!");
    }

    @Override
    public boolean giveAnswer() {
        return Voiceable.super.giveAnswer();
    }

    @Override
    public int give2Answer() {
        return 0;
    }

    @Override
    public void dance() {
        System.out.println("Im dancing!");
    }
}
