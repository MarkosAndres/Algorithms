package com.marcos.observable.Weather;

public class App
{
	public static void main(String[] args)
	{
		WeatherData data = new WeatherData();
		
		ForecastDisplay forecast = new ForecastDisplay(data);
		GeneralDisplay general = new GeneralDisplay(data);
		
		data.setMeasurements(31f, 60f, 21f);
	}
}