package model;

import java.util.ArrayList;

public class Company {

	//atributes
	private String name;
	
	//relation
	private ArrayList <Vehicle> vehicles;
    private Vehicle[][] parking;

	//methods
	public Company(String name) {
		this.name = name;
		vehicles = new ArrayList <Vehicle>();
		parking = new Vehicle[8][4];
	}
	
	public String registerGasoline(boolean alreadyUsed, double basePrice, double sellPrice, 
			String trademark, String model, String cilinderCapacity, String km, String licensePlate,
			String numDoors, int polaryze, int carTyp,  double soatPrice, int soatYear, String soatImage, 
			int technoYear, String technoImage, String soatNum, String technoNum, String gasolineCapacity, 
			String gasolineConsume, int gasolineTyp) {
		String message = "Your vehicle have been registered succesfully";
		vehicles.add(new Gasoline(alreadyUsed, basePrice, sellPrice, trademark, model, 
				cilinderCapacity, km, licensePlate, numDoors, carTyp, polaryze, soatNum, soatPrice, soatYear, 
				soatImage, technoNum, technoYear, technoImage, gasolineCapacity,
				gasolineConsume, gasolineTyp));
		return message;
	}
	
	public String registerElectric(boolean alreadyUsed, double basePrice, double sellPrice,
			String trademark, String model, String cilinderCapacity, String km, String licensePlate,
			String numDoors, int polaryze, int carTyp, String soatNum, double soatPrice, int soatYear, String soatImage, 
			String technoNum, int technoYear, String technoImage, String batteryDuration, String batteryConsume, 
			int batteryTyp) {
		String message = "Your vehicle have been registered succesfully";
		vehicles.add(new Electric(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, 
				km, licensePlate, numDoors, polaryze, carTyp,soatNum, soatPrice, soatYear, soatImage, technoNum, technoYear, 
				technoImage, batteryDuration, batteryConsume, batteryTyp));
		return message;
	}
	
	public String registerHybrid(boolean alreadyUsed, double basePrice, double sellPrice, String trademark,
			String model, String cilinderCapacity, String km, String licensePlate, String numDoors, 
			int polaryze, int carTyp, double soatPrice, int soatYear, String soatImage, 
			int technoYear, String technoImage, String soatNum, String technoNum, String gasolineCapacity, 
			String gasolineConsume, int gasolineTyp, String batteryDuration, String batteryConsume, int batteryTyp) {
		String message = "Your vehicle have been registered succesfully";
		vehicles.add(new Hybrid(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, km, 
				licensePlate, numDoors, polaryze, carTyp, soatNum, soatPrice, soatYear, soatImage, technoNum, technoYear,
				technoImage, gasolineCapacity, gasolineConsume, batteryConsume, 
				batteryDuration, gasolineTyp, batteryTyp));
		return message;	
	}
	
	public String registerMotorcycle(boolean alreadyUsed, double basePrice, double sellPrice, String trademark, 
			String model, String cilinderCapacity, String km, String licensePlate, double soatPrice, int soatYear, String soatImage, 
			int technoYear, String technoImage, String soatNum, String technoNum, String gasolineCapacity, 
			String gasolineConsume, int motorcycleTyp) {
		String message = "Your vehicle have been registered succesfully";
		vehicles.add(new Motorcycle(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, km, 
				licensePlate, gasolineCapacity, gasolineConsume, motorcycleTyp, soatNum, soatPrice, soatYear, 
				soatImage, technoNum, technoYear, technoImage));
		return message;
	}
	
	public String vehicleType() {
		String message = "";
		for(int i = 0; i < vehicles.size(); i++) {
			message = ()
		}
	}
}
