package com.vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.vehicle.Vehicle.FuelType;
import com.vehicle.Vehicle.VehicleType;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<String, Float> distanceMap = new HashMap<String, Float>();
		distanceMap.put("Pune", (float) 0);
		distanceMap.put("Mumbai", (float) 200);
		distanceMap.put("Bangalore", (float) 1000);
		distanceMap.put("Delhi", (float) 2050);
		distanceMap.put("Chennai", (float) 1234.5);

		Map<String, String> vehicleMap = new HashMap<String, String>();
		vehicleMap.put("Swift", "Car");
		vehicleMap.put("Mahindra XUV 500", "SUV");
		vehicleMap.put("alto", "Car");
		vehicleMap.put("Tata Skyline", "Bus");

		Map<String, Float> tollmap = new HashMap<String, Float>();
		tollmap.put("Pune", (float) 0);
		tollmap.put("Mumbai", (float) 100);
		tollmap.put("Bangalore", (float) 500);
		tollmap.put("Delhi", (float) 700);
		tollmap.put("Chennai", (float) 1000);

		String source, destination, carName = "", vehicleType;
		int petrolCost = 80;
		int dieselCost = 60;
		FuelType fuelType = null;
		VehicleType airConditionType = null;
		float totalCost, totalCostincludingExtraMembers, totalCostincludingExtraMembersAndToll, totalFuelCost = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter source : ");
		source = br.readLine();
		if (!distanceMap.keySet().contains(source)) {
			System.out.println("please enter valid city");
			System.exit(0);
		}
		System.out.println("Enter destination : ");
		destination = br.readLine();
		if (!distanceMap.keySet().contains(destination)) {
			System.out.println("please enter valid city");
			System.exit(0);
		}
		System.out.println(
				"Enter car in which you would like to travel :\n1.Swift\n2.Mahindra XUV 500\n3.alto\n4.Tata Skyline");
		int carNamechoice = Integer.parseInt(br.readLine());
		switch (carNamechoice) {
		case 1:
			carName = "Swift";
			break;
		case 2:
			carName = "Mahindra XUV 500";
			break;
		case 3:
			carName = "alto";
			break;
		case 4:
			carName = "Tata Skyline";
			break;

		default:
			System.out.println("You have entered wrong choice");
		}

		vehicleType = vehicleMap.get(carName);
		if (vehicleType.equals("Car") || vehicleType.equals("Bus")) {
			System.out.println("Do you want \n1.AC\n2.NonAC");
			int ACNonACChoice = Integer.parseInt(br.readLine());
			switch (ACNonACChoice) {
			case 1:
				airConditionType = VehicleType.AC;
				break;
			case 2:
				airConditionType = VehicleType.NONAC;
				break;
			default:
				System.out.println("You have entered wrong choice");
			}
		}
		if (vehicleType.equals("Car")) {
			System.out.println("Do you want\n1.Petrol\n2.Diesel");
			int fuelTypeChoice = Integer.parseInt(br.readLine());
			switch (fuelTypeChoice) {
			case 1:
				fuelType = FuelType.PETROL;
				break;
			case 2:
				fuelType = FuelType.DIESEL;
				break;
			default:
				System.out.println("You have entered wrong choice");
				break;
			}
		}
		System.out.println("Enter the number of persons travelling");
		int numberOfPersons = Integer.parseInt(br.readLine());

		float distanceOfsourceFromPune = distanceMap.get(source);
		float distanceOfdestinationFromPune = distanceMap.get(destination);
		float totalDistance = distanceOfdestinationFromPune + distanceOfsourceFromPune;
		float tollfromsourcetoPune = tollmap.get(source);
		float tollfromPuneToDestination = tollmap.get(destination);
		float totalToll = tollfromsourcetoPune + tollfromPuneToDestination;

		Vehicle vehicle = null;
		if (vehicleType.equals("Car")) {
			vehicle = new Car(carName, fuelType, airConditionType);
		} else if (vehicleType.equals("SUV")) {
			vehicle = new SUV(carName);
		} else {
			vehicle = new Bus(carName, airConditionType);
		}
		totalCost = vehicle.getTotalVehicleFare(vehicle, totalDistance);
		System.out.println("Total Cost for travelling is : " + totalCost);
		totalCostincludingExtraMembers = vehicle.getTotalVehicleFareWithExtraPassengers(vehicle, totalDistance,
				numberOfPersons);
		System.out.println("Total Cost for travelling with extra persons is  : " + totalCostincludingExtraMembers);
		totalCostincludingExtraMembersAndToll = vehicle.getTotalVehicleFareWithExtraPassengers(vehicle, totalDistance,
				numberOfPersons) + totalToll;
		System.out.println("Total Cost for travelling with toll : " + totalCostincludingExtraMembersAndToll);

		if (vehicle.getFuelType().equals(FuelType.PETROL)) {
			totalFuelCost = vehicle.getFuelCost(vehicle, petrolCost,totalDistance);
		} else if (vehicle.getFuelType().equals(FuelType.DIESEL)) {
			totalFuelCost = vehicle.getFuelCost(vehicle, dieselCost,totalDistance);
		}
		System.out.println("Fuel cost is : "+totalFuelCost);
	}

}
