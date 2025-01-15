package architectural.layers;

import java.util.Scanner;

public class CarRentalPresentation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CarRentalService service=new CarRentalService(new CarRepository());
        System.out.println("Welcome. Below are our available cars");
        System.out.println(service.getAvailableCars());
        System.out.println("Which car would you like to rent? Enter its license plate: ");
        String license=scanner.next();
        boolean rented=service.rentCar(license);
        if(rented)  System.out.println("Yay you got the car.");
        else        System.out.println("Not yay you did not enter a valid license.");
        scanner.close();
    }
}