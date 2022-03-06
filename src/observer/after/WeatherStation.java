package observer.after;

import observer.after.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(70, 60, 30.4f);
        weatherData.setMeasurements(55, 50, 15.4f);
        weatherData.setMeasurements(90, 70, 40.4f);
    }

}
