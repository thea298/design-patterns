package architectural.layers;

import java.util.*;

//service/business layer
public class CarRentalService {
    private CarRepository repo;

    public CarRentalService(CarRepository repo) {
        this.repo = repo;
    }

    public List<Car> getAvailableCars(){
        List<Car> allCars=repo.getAllCars();
        /* List<Car> availableCars=new ArrayList<Car>();
        for(Car car:allCars){
            if(car.isAvailable()){
                availableCars.add(car);
            }
        }
        return availableCars; */
        allCars.removeIf((car->!car.isAvailable()));
        return allCars;
    }

    public boolean rentCar(String licensePlate){
        Car car=repo.findCarByLicensePlate(licensePlate);
        if(car==null||!car.isAvailable())   return false;
        car.setAvailable(false);
        return true;
    }
    
}