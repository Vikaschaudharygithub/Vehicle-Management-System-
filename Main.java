public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Car ---");
        Car myCar = new Car(120, 50.5, 4);
        myCar.start();
        myCar.displayFuel();
        myCar.honk();
        myCar.stop();

        System.out.println();

        System.out.println("--- Testing Bicycle ---");
        Bicycle myBike = new Bicycle(15, 0, true);
        myBike.start();
        myBike.displayFuel();
        myBike.ringBell();
        myBike.stop();

        System.out.println();

        System.out.println("--- Access Specifiers Testing ---");
        System.out.println("Car speed (protected): " + myCar.speed);
        System.out.println("Car fuel (via getter): " + myCar.getFuel());
    }
}
