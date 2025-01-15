package exercises.chap4_ex1;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherAppProxy proxy=new WeatherAppProxy();
        System.out.println(proxy.updateWeather("Gaza"));
        
    }
}
