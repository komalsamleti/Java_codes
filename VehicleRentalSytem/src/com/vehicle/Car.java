package com.vehicle;

public class Car extends Vehicle {
	static private final float AC_PETROL_CAR_FARE=11;
	static private final float NON_AC_PETROL_CAR_FARE=9;
	static private final float AC_DIESEL_CAR_FARE=10;
	static private final float NON_AC_DIESEL_CAR_FARE=8;
	static private final int MAX_NUMBER_OF_PASSENGERS_FOR_CAR=5;
	static private final float AVERAGE_OF_AC_PETROL_CAR=20;
	static private final float AVERAGE_OF_NONAC_PETROL_CAR=22;
	static private final float AVERAGE_OF_NONAC_DIESEL_CAR=27;
	static private final float AVERAGE_OF_AC_DIESEL_CAR=25;
	
	public Car(String name, FuelType fuelType, VehicleType vehicleType) {
		// TODO Auto-generated constructor stub
		super.setId(name);
		super.setFuelType(fuelType);
		super.setVehicleType(vehicleType);
		super.setMaxLimitOfVehicle(MAX_NUMBER_OF_PASSENGERS_FOR_CAR);

		if (fuelType.equals(FuelType.PETROL)) {
			if (vehicleType.equals(VehicleType.AC)) {
				super.setAvgOfVehicle(AVERAGE_OF_AC_PETROL_CAR);
				super.setFare(AC_PETROL_CAR_FARE);
			} else {
				super.setAvgOfVehicle(AVERAGE_OF_NONAC_PETROL_CAR);
				super.setFare(NON_AC_PETROL_CAR_FARE);
			}
		}
		if (fuelType.equals(FuelType.DIESEL)) {
			if (vehicleType.equals(VehicleType.AC)) {
				super.setAvgOfVehicle(AVERAGE_OF_AC_DIESEL_CAR);
				super.setFare(AC_DIESEL_CAR_FARE);
			} else {
				super.setAvgOfVehicle(AVERAGE_OF_NONAC_DIESEL_CAR);
				super.setFare(NON_AC_DIESEL_CAR_FARE);
			}
		}
	}
}
