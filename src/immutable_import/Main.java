package immutable_import;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Bmw", "Czerwony");
        car.setColor("Biialy");
        car.setName("Mercedes");
        System.out.println(car.toString());

    }
}
