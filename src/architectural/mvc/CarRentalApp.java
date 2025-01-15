package architectural.mvc;

import java.util.*;

public class CarRentalApp {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("7800hg", "Honda", "Civic", 100));
        cars.add(new Car("0987ui", "BMW", "M3", 200));
        cars.add(new Car("1234tg", "Toyota", "Corolla", 30));

        CarRentalController controller = new CarRentalController(cars, new CarRentalView());
        controller.showAvailableCars();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the license plate of the car you wish to rent:");
        String license = scan.next();
        controller.rentCar(license);
        scan.close();
    }

}