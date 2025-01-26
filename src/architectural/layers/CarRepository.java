package architectural.layers;

import java.util.*;

//data layer
public class CarRepository {
    private List<Car> cars=new ArrayList<>();

    public CarRepository(){
        cars.add(new Car("345N", "Mitsubishi", "Montero", 200));
        cars.add(new Car("678T", "Toyota", "Corolla", 70));
        cars.add(new Car("098J", "Seat", "Ibiza", 100));
    }

    public List<Car> getAllCars(){
        return this.cars;
    }

    public void addCar(String licensePlate, String brand, String model, double rentalPrice){
        for(Car car:cars){
            if(car.getLicensePlate().equals(licensePlate)){
                System.out.println("Car already exists.");
                return;
                //throw new IllegalArgumentException("Car already exists"); stops the whole program. u can use try catch to only sotp the method
            }
        }
        cars.add(new Car(licensePlate, brand, model, rentalPrice));
    }

    public void removeCar(String licensePlate, String brand, String model, double rentalPrice){
        for(Car car:cars){
            if(car.getLicensePlate().equals(licensePlate)){
                cars.remove(car);
                return;
            }
        }
        System.out.println("Car does not exist.");
    }

    public Car findCarByLicensePlate(String licensePlate){
        for(Car car:cars){
            if(car.getLicensePlate().equals(licensePlate)){
                return car;
            }
        }
        return null;
    }

}