package polimorfizm;

public class Main {
    public static void main(String[] args) {
        Car[] arr = new Car[1000];

        for(int i = 0; i < arr.length; i++){
            if(i % 2 ==0){
                arr[i] = new Suv("czerwony", i + 1);
            }else{
                arr[i] = new Cabriolet("Nebeski", true);
            }
        }
        int i = 0;
        for (Car car : arr) {
            System.out.println(arr[i].toString());
            i++;
        }





        Cabriolet cab1 = new Cabriolet("Czerwony", true);
        Cabriolet cab2 = new Cabriolet("Niebieski", true);
        Cabriolet cab3 = new Cabriolet("Biały", true);

        Suv suv1 = new Suv("Czerwony", 1.95);
        Suv suv2 = new Suv("Niebieski", 1.8);
        Suv suv3 = new Suv("Zolty", 1.75);

        cab1.describe();
    }
}
