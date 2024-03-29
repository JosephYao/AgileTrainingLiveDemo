package com.autodesk.agiledemo;

public class Weather {
	private String city;
	private String region;
	private String country;
	private double temperature;
	private String condition;
	private String humidity;
	private String windSpeed;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	public String getWearingAdvice() {
		if (condition.equals("Raining") && isHot())
			return "Umbrella, T-shirt";
		
		if (condition.equals("Raining") && isWarm())
			return "Raincoat";
		
		if (condition.equals("Sunny") && isHot())
			return "T-shirt";
		
		if (condition.equals("Sunny") && isWarm())
			return "Shirts";
		
		return "Advice not available";
	}
	private boolean isWarm() {
		return temperature >= 60 && temperature <= 69;
	}
	private boolean isHot() {
		return temperature >= 70 && temperature <= 79;
	}	
}