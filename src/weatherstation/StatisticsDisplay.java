package weatherstation;

public class StatisticsDisplay implements Observer, DisplayElement {
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Weather data updated for StatisticsDisplay");

	}

	@Override
	public void display() {
		System.out.println("Display: StatisticsDisplay");
	}

}
