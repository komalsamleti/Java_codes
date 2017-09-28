package com.vehicle;

public class SUV extends Vehicle {
	static private final float SUV_FARE=10;
	static private final int MAX_NUMBER_OF_PASSENGER_FOR_SUV=7;
	static private final float AVERAGE_OF_SUV=20;
	
	public SUV(String name) {
		// TODO Auto-generated constructor stub
		super.setId(name);
		super.setFuelType(FuelType.DIESEL);
		super.setVehicleType(VehicleType.AC);
		super.setMaxLimitOfVehicle(MAX_NUMBER_OF_PASSENGER_FOR_SUV);
		super.setFare(SUV_FARE);
		super.setAvgOfVehicle(AVERAGE_OF_SUV);
		
	}
}
