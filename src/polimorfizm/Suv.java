package polimorfizm;

public class Suv extends Car{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Suv{" +
                "height=" + height +
                ", color='" + color + '\'' +
                "} " ;
    }

    public Suv(String color, double height) {
        super(color);
        this.height = height;
    }
}
