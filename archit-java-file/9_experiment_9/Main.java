import vehicles.Car;
import vehicles.Truck;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // create a new Car
        System.out.println("\n***********enter details of car below: *********");
        System.out.print("enter brand: ");
        String Carbrand = sc.nextLine();
        System.out.print("enter year: ");
        int Caryear = sc.nextInt();
        System.out.print("numDoors: ");
        int CarnumDoors = sc.nextInt();

        // create car object
        Car myCar = new Car(Carbrand, Caryear, CarnumDoors);

        // create a truck
        System.out.println("\n*******enter details of truck below: ****");
        System.out.print("enter brand: ");
        String truckBrand = sc.next();
        System.out.print("enter year: ");
        int truckYear = sc.nextInt();
        System.out.print("payload: ");
        int truckpaylaod = sc.nextInt();

        // create an truck object
        Truck myTruck = new Truck(truckBrand, truckYear, truckpaylaod);
        
        System.out.println("\n**********car details are*********");
        System.out.println("Car brand: " + myCar.getBrand());
        System.out.println("Car year: " + myCar.getYear());
        System.out.println("Car doors: " + myCar.getNumDoors());
        
        System.out.println("\n**********truck details are*********");
        System.out.println("Truck brand: " + myTruck.getBrand());
        System.out.println("Truck year: " + myTruck.getYear());
        System.out.println("Truck payload capacity: " + myTruck.getPayloadCapacity());

        System.out.println("\n******driving car***********");
        myCar.drive();
        System.out.println("\n******driving truck***********");
        myTruck.drive();

        sc.close();
    }
}
