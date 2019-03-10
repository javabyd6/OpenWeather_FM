package pl.sda.openWeather.Weather;

import pl.sda.openWeather.Model.Weather;

import java.util.Scanner;

/**
 * @author fmucko
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String url = "http://api.apixu.com/v1/current.json?key=";

        String apiKey = "163f8e65c5414bd3938122242191003";//scanner.nextLine();

        WeatherService weatherService = new WeatherService(url,apiKey);
        System.out.println("Type a city: ");
        String city = "";
        Weather weather;
        while(city!="null"){
        city = scanner.nextLine();
        weather = weatherService.getCityWeather(city);
        System.out.println("City: " + city);
        System.out.println("Temp: " + weather.getCurrent().getTemp_c());}

    }
}
