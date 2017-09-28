package com.vehicle;

public class Bus extends Vehicle {
	static private final float AC_BUS_FARE=10;
	static private final float NON_AC_BUS_FARE=9;
	static private final int MAX_NUMBER_OF_PASSENGER_FOR_BUS=40;
	static private final int AVG_OF_AC_BUS=17;
	static private final int AVG_OF_NONAC_BUS=15;
	
	public Bus(String name,VehicleType type) {
		// TODO Auto-generated constructor stub
		super.setId(name);
		super.setFuelType(FuelType.DIESEL);
		super.setVehicleType(type);
		super.setMaxLimitOfVehicle(MAX_NUMBER_OF_PASSENGER_FOR_BUS);
		if (type.equals(VehicleType.AC)) {
			super.setAvgOfVehicle(AVG_OF_AC_BUS);
			super.setFare(AC_BUS_FARE);
		}
		if (type.equals(VehicleType.NONAC)) {
			super.setAvgOfVehicle(AVG_OF_NONAC_BUS);
			super.setFare(NON_AC_BUS_FARE);
		}
	}
}
