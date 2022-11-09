package hashMap;

import java.util.Objects;

public class Car {
    private int yearOfProduction;
    private String marka;

    @Override
    public String toString() {
        return "Car{" +
                "yearOfProduction=" + yearOfProduction +
                ", marka='" + marka + '\'' +
                ", seria='" + seria + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && Objects.equals(marka, car.marka) && Objects.equals(seria, car.seria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfProduction, marka, seria);
    }

    private String seria;

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getMarka() {
        return marka;
    }

    public String getSeria() {
        return seria;
    }

    public Car(int yearOfProduction, String model, String seria) {
        this.yearOfProduction = yearOfProduction;
        this.marka = model;
        this.seria = seria;
    }
}
