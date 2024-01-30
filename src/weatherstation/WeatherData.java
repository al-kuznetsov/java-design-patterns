package weatherstation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private double temperature;
	private double humidity;
	private int pressure;

	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public int getPressure() {
		return pressure;
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(double temperature, double humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		observers.forEach(Observer::update);

	}

}
