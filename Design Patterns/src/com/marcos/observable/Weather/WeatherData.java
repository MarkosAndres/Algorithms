package com.marcos.observable.Weather;

import java.util.Observable;

public class WeatherData extends Observable
{
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public float getTemperature(){
		return this.temperature;
	}
	
	public float getPressure(){
		return this.humidity;
	}
	
	public float getHumidity(){
		return this.pressure;
	}
	
	
	
	
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
}
