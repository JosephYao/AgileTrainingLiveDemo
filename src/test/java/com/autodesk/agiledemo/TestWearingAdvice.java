package com.autodesk.agiledemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWearingAdvice {

	@Test public void sunny_and_temparaturn_between_60_and_69() {
		assertWearingAdviceEquals("Sunny", 60, "Shirts");
		assertWearingAdviceEquals("Sunny", 69, "Shirts");
	}

	@Test public void sunny_and_temparature_between_70_and_79() {
		assertWearingAdviceEquals("Sunny", 70, "T-shirt");
		assertWearingAdviceEquals("Sunny", 79, "T-shirt");
	}
	
	@Test public void raining_and_temparature_between_60_and_69() {
		assertWearingAdviceEquals("Raining", 60, "Raincoat");
		assertWearingAdviceEquals("Raining", 69, "Raincoat");
	}
	
	@Test public void raining_and_temparature_between_70_and_79() {
		assertWearingAdviceEquals("Raining", 70, "Umbrella, T-shirt");
		assertWearingAdviceEquals("Raining", 79, "Umbrella, T-shirt");
	}
	
	@Test public void advice_not_available() {
		assertWearingAdviceEquals("Cloudy", 79, "Advice not available");
		assertWearingAdviceEquals("Sunny", 80, "Advice not available");
		assertWearingAdviceEquals("Raining", 59, "Advice not available");
		assertWearingAdviceEquals("Raining", 80, "Advice not available");
	}
	
	private void assertWearingAdviceEquals(String condition, double temparature, String expectedWearingAdvice) {
		Weather weather = new Weather();
		weather.setCondition(condition);
		weather.setTemperature(temparature);
		
		assertEquals(expectedWearingAdvice, weather.getWearingAdvice());
	}
	
}
