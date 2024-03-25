package course.weatherstation;

public class ForecastDisplay implements Observer, DisplayElement {
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Weather data updated for ForecastDisplay");

	}

	@Override
	public void display() {
		System.out.println("Display: Forecast Display");
	}

}
