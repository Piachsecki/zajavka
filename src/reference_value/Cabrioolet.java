package reference_value;

public class Cabrioolet extends Car{
    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public Engine getEngine() {
        return super.getEngine();
    }

    @Override
    public void setEngine(Engine engine) {
        super.setEngine(engine);
    }

    public Cabrioolet(String color, Engine engine) {
        super(color, engine);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
