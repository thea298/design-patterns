package architectural.layers;

//data layer
public class Car {
    private String licensePlate;
    private String brand;
    private String model;
    private double rentalPrice;
    private boolean available;
    
    public Car(String licensePlate, String brand, String model, double rentalPrice) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.available = true;
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Car [licensePlate=" + licensePlate + ", brand=" + brand + ", model=" + model + ", rentalPrice="
                + rentalPrice + ", available=" + available + "]";
    }  

}