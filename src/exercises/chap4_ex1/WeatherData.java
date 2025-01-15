package exercises.chap4_ex1;

public class WeatherData {
    private String location;
    private double temp;
    private String condition;
    public WeatherData(String location, double temp, String condition) {
        this.location = location;
        this.temp = temp;
        this.condition = condition;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    @Override
    public String toString() {
        return "WeatherData [location=" + location + ", temp=" + temp + ", condition=" + condition + "]";
    }
    
}
