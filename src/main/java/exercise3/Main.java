package exercise3;


public class Main {
    public static void main(String[] args) {
        Car car = new Car(20, 15000, "ZH420", 6.5, 50);

        System.out.println(car);
        car.drive(200);
        System.out.println(car);
        car.refuel(40);
        System.out.println(car);
        car.drive(1000);
        System.out.println(car);
    }
}
