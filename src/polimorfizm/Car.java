package polimorfizm;

public class Car {
    protected String color;

    public Car(String color) {
        this.color = color;
    }

    public void describe(){
        System.out.println("Car described: " + this.color);
    }
}
