package polimorfizm;

public class Cabriolet extends Car{
    private boolean isRoofOpened;

    public boolean isRoofOpened() {
        return isRoofOpened;
    }

    public void setRoofOpened(boolean roofOpened) {
        isRoofOpened = roofOpened;
    }

    public Cabriolet(String color, boolean isRoofOpened) {
        super(color);
        this.isRoofOpened = isRoofOpened;
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "isRoofOpened=" + isRoofOpened +
                ", color='" + color + '\'' +
                "} ";
    }

    @Override
    public void describe() {
        System.out.println("Cabriolet described: " + this.toString());
    }
}
