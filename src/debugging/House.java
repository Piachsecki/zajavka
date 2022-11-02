package debugging;

public class House {
    private double area;

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", address='" + address + '\'' +
                '}';
    }

    private String address;

    public House(double area, String address) {
        constructArea(area);
        assignAddress(address);
    }

    private void assignAddress(String address) {
        this.address = address;
    }

    private void constructArea(double area) {
        System.out.println("Constructing area!");
        buildWalls(8);
        if(area > 0 && area < 10){
            this.area = area*3;
        }else{
            this.area = area;
        }
        System.out.println("Area constructed!");
    }

    private void buildWalls(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println("Bulding brick me " + (i+1));
        }
        System.out.println("Built walls");
    }

    public double getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }
}
