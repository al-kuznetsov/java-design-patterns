package course.weatherstation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private WeatherData weatherData;

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Weather data updated for CurrentConditionsDisplay");
	}

	@Override
	public String toString() {
		return "CurrentConditionsDisplay [temperatue=" + weatherData.getTemperature() + ", humidity="
				+ weatherData.getHumidity() + ", pressure=" + weatherData.getPressure() + "]";
	}

	@Override
	public void display() {
		System.out.println("Display: " + toString());
	}

}
