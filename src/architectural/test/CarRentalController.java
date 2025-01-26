package architectural.test;

import java.util.*;

public class CarRentalController {
    private List<Car> cars;
    private CarRentalView view;

    public CarRentalController(List<Car> cars, CarRentalView view) {
        this.cars = cars;
        this.view = view;
    }

    public void showAvailableCars() {
        List<Car> availableCars = new ArrayList<Car>();
        for (Car car : cars) {
            if (car.isAvailable()) {
                availableCars.add(car);
            }
        }
        view.displayAvailableCars(cars);
    }

    

}
