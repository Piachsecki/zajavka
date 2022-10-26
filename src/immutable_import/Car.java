package immutable_import;

final public class Car {
    private String name;
    final private int numberOfWheels = 4;
    private String color;

    public Car() {
        super();
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
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String name, int numberOfWheels, String color) {
        this.name = name;
//        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
