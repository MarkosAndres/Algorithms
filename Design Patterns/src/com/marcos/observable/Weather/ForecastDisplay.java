package com.marcos.observable.Weather;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer
{
	
	public ForecastDisplay(Observable o)
	{
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg)
	{
		if(o instanceof WeatherData){
			WeatherData data = (WeatherData)o;
			System.out.println("Forecast - Pressure: "+data.getPressure());
		}
	}

}