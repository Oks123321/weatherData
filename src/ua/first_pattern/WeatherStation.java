package ua.first_pattern;

public class WeatherStation {

    public static void main(String[] args) {
	WeatherData weatherData = new WeatherData();

	CurrentConditionalsDisplay currentConditionalsDisplay = new CurrentConditionalsDisplay(weatherData);
//	StatisticsDisplay statisticsDisplay = new StatisticsDisplay;
//	ForecastDisplay forecastDisplay = new ForecastDisplay;

        weatherData.setMeasurements(80,65, 30.4f);
        weatherData.setMeasurements(82,70, 29.2f);
        weatherData.setMeasurements(78,90, 29.2f);

    }
}
