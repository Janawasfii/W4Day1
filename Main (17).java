import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Vehicle> rentedVehicles = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Vehicle Rental System");
            System.out.println("1.Rent a Car");
            System.out.println("2.Rent a Bike");
            System.out.println("3.Rent a Truck");
            System.out.println("4.View Rented Vehicles");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    String carModel = scan.nextLine();
                    System.out.print("Enter Rental Days: ");
                    int carDays = scan.nextInt();
                    scan.nextLine();
                    Vehicle car = new Cars(carModel, carDays);
                    rentedVehicles.add(car);
                    System.out.println("*********************************");
                    car.displayDetails();
                    System.out.println("*********************************");
                    break;
                case 2:
                    System.out.print("Enter Bike Brand: ");
                    String bikeBrand = scan.nextLine();
                    System.out.print("Enter Rental Hours: ");
                    int bikeHours = scan.nextInt();
                    scan.nextLine();
                    Vehicle bike = new Bikes(bikeBrand, bikeHours);
                    rentedVehicles.add(bike);
                    System.out.println("*********************************");
                    bike.displayDetails();
                    System.out.println("*********************************");
                    break;
                case 3:
                    System.out.print("Enter Truck Type: ");
                    String truckType = scan.nextLine();
                    System.out.print("Enter Rental Weeks: ");
                    int truckWeeks = scan.nextInt();
                    scan.nextLine();
                    Vehicle truck = new Trucks(truckType, truckWeeks);
                    rentedVehicles.add(truck);
                    System.out.println("*********************************");
                    truck.displayDetails();
                    System.out.println("*********************************");
                    break;
                case 4:
                    System.out.println("Rented Vehicles:");
                    for (Vehicle v : rentedVehicles) {
                        v.displayDetails();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }






        }
//public static void v(Vehicle vehicle){
//vehicle.displayDetails();
//vehicle.calculateRentalCost();
//
//}

    }
