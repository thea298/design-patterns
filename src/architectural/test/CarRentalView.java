package architectural.test;

import java.util.List;

public class CarRentalView {
     public void displayAvailableCars(List<Car> cars){
        for(Car car: cars){
            System.out.println(car);
        }
    }

    public void displayRentedCar(Car car) {
        System.out.println("The following car has been rented: " + car.toString());
    }

    public void displayError(String message) {
        System.out.println("Error: " + message);
    }
}