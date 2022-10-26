package reference_value;

public class Car {
    private String color;

    private Engine engine;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String color, Engine engine) {
        this.color = color;
        this.engine = engine;
    }
}
