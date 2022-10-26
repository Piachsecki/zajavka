package Interface;

public interface Voiceable {
    void giveMeVoice();
    default boolean giveAnswer(){
        return true;
    }
    int give2Answer();
}
