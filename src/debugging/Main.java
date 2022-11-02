package debugging;

public class Main {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();
        House house = houseBuilder.buildHouse(5.0, "zajavkowa");
        System.out.println(house.getArea());
        System.out.println(house.getAddress());

    }
}
