package com.vehicle;

public abstract class Vehicle {
	private String id;
	private FuelType fueltype;
	private VehicleType vehicleType;
	private float fare;
	private int maxLimitOfPassengerForVehicle;
	private float avgOfVehicle;

	enum FuelType {
		DIESEL, PETROL
	}

	enum VehicleType {
		AC, NONAC
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FuelType getFuelType() {
		return fueltype;
	}

	public void setFuelType(FuelType type) {
		this.fueltype = type;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public float getAvgOfVehicle() {
		return avgOfVehicle;
	}

	public void setAvgOfVehicle(float avgOfVehicle) {
		this.avgOfVehicle = avgOfVehicle;
	}

	public int getMaxLimitOfPassengerForVehicle() {
		return maxLimitOfPassengerForVehicle;
	}

	public void setMaxLimitOfVehicle(int maxLimitOfVehicle) {
		this.maxLimitOfPassengerForVehicle = maxLimitOfVehicle;
	}

	public float getTotalVehicleFare(Vehicle vehicle, float totalDistance) {
		float totalCost = 0;
		if (vehicle instanceof Car || vehicle instanceof SUV) {
			totalCost = vehicle.getFare() * totalDistance;
		} else if (vehicle instanceof Bus) {
			float discount = vehicle.getFare() * totalDistance * 0.02f;
			totalCost = vehicle.getFare() * totalDistance - discount;
		}

		return totalCost;

	}

	public float getTotalVehicleFareWithExtraPassengers(Vehicle vehicle, float totalDistance, int noOfPassengers) {
		float totalCost = 0;
		float extraCost = 0, discount;

		int extraMembers = noOfPassengers - vehicle.getMaxLimitOfPassengerForVehicle();
		if (extraMembers > 0 && (vehicle instanceof Car || vehicle instanceof SUV)) {
			extraCost = 1.5f * totalDistance * extraMembers;
		}
		if (extraMembers > 0 && vehicle instanceof Bus) {
			discount = 1.5f * totalDistance * extraMembers * 0.02f;
			extraCost = 1.5f * totalDistance * extraMembers - discount;
		}
		totalCost = vehicle.getTotalVehicleFare(vehicle, totalDistance) + extraCost;
		return totalCost;

	}

	public float getFuelCost(Vehicle vehicle, int fuelCost, float totalDistance) {
		float totalFuelCost = (totalDistance / vehicle.getAvgOfVehicle()) * fuelCost;
		// TODO Auto-generated method stub
		return totalFuelCost;
	}

}
