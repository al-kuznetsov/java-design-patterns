package weatherstation;

public class WeatherStationDriver {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		weatherData.setMeasurements(10.0, 20.0, 115);

		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

		currentConditionsDisplay.display();
		forecastDisplay.display();
		statisticsDisplay.display();

		weatherData.setMeasurements(20.0, 24.0, 120); // notification called here

		currentConditionsDisplay.display();
		forecastDisplay.display();
		statisticsDisplay.display();

		weatherData.setMeasurements(21.0, 33.0, 122); // notification called here

		currentConditionsDisplay.display();
		forecastDisplay.display();
		statisticsDisplay.display();
	}
}
