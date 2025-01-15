package exercises.chap4_ex1;

public class WeatherAPIService implements WeatherInterface{

    @Override
    public String updateWeather(String location){
        return "19°C, Mostly Cloudy";
    }
}
