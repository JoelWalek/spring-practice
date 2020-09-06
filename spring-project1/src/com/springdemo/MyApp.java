package com.springdemo;

//first test class to ensure classes work before using Spring
public class MyApp {

	public static void main(String[] args) {
	

		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());
	}

}
