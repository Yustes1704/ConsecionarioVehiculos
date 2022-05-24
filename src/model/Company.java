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

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public Vehicle[][] getParking() {
		return parking;
	}

	public void setParking(Vehicle[][] parking) {
		this.parking = parking;
	}

	public String registerGasoline(boolean alreadyUsed, double basePrice, double sellPrice, 
			String trademark, int model, String cilinderCapacity, String km, String licensePlate,
			String numDoors, int polaryze, int carTyp,  double soatPrice, int soatYear, String soatImage, 
			int technoYear, String technoImage, String soatNum, String technoNum, String gasolineCapacity, 
			String gasolineConsume, int gasolineTyp) {
		String message = "Your vehicle have been registered succesfully";
		Vehicle car = new Gasoline(alreadyUsed, basePrice, sellPrice, trademark, model, 
				cilinderCapacity, km, licensePlate, numDoors, carTyp, polaryze, soatNum, soatPrice, soatYear, 
				soatImage, technoNum, technoYear, technoImage, gasolineCapacity,
				gasolineConsume, gasolineTyp);
		vehicles.add(car);
		if(car.getAlreadyUsed() == true && car.getModel() < 2015) {
			addParking(car);
		}
		return message;
	}

	public String registerElectric(boolean alreadyUsed, double basePrice, double sellPrice,
			String trademark, int model, String cilinderCapacity, String km, String licensePlate,
			String numDoors, int polaryze, int carTyp, String soatNum, double soatPrice, int soatYear, String soatImage, 
			String technoNum, int technoYear, String technoImage, String batteryDuration, String batteryConsume, 
			int batteryTyp) {
		String message = "Your vehicle have been registered succesfully";
		Vehicle car = new Electric(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, 
				km, licensePlate, numDoors, polaryze, carTyp,soatNum, soatPrice, soatYear, soatImage, technoNum, technoYear, 
				technoImage, batteryDuration, batteryConsume, batteryTyp);
		vehicles.add(car);
		if(car.getAlreadyUsed() == true && car.getModel() < 2015) {
			addParking(car);
		}
		return message;
	}

	public String registerHybrid(boolean alreadyUsed, double basePrice, double sellPrice, String trademark,
			int model, String cilinderCapacity, String km, String licensePlate, String numDoors, 
			int polaryze, int carTyp, double soatPrice, int soatYear, String soatImage, 
			int technoYear, String technoImage, String soatNum, String technoNum, String gasolineCapacity, 
			String gasolineConsume, int gasolineTyp, String batteryDuration, String batteryConsume, int batteryTyp) {
		String message = "Your vehicle have been registered succesfully";
		Vehicle car = new Hybrid(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, km, 
				licensePlate, numDoors, polaryze, carTyp, soatNum, soatPrice, soatYear, soatImage, technoNum, technoYear,
				technoImage, gasolineCapacity, gasolineConsume, batteryConsume, 
				batteryDuration, gasolineTyp, batteryTyp);
		vehicles.add(car);
		if(car.getAlreadyUsed() == true && car.getModel() < 2015) {
			addParking(car);
		}
		return message;	
	}

	public String registerMotorcycle(boolean alreadyUsed, double basePrice, double sellPrice, String trademark, 
			int model, String cilinderCapacity, String km, String licensePlate, double soatPrice, int soatYear, String soatImage, 
			int technoYear, String technoImage, String soatNum, String technoNum, String gasolineCapacity, 
			String gasolineConsume, int motorcycleTyp) {
		String message = "Your vehicle have been registered succesfully";
		Vehicle car = new Motorcycle(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, km, 
				licensePlate, gasolineCapacity, gasolineConsume, motorcycleTyp, soatNum, soatPrice, soatYear, 
				soatImage, technoNum, technoYear, technoImage);
		vehicles.add(car);
		if(car.getAlreadyUsed() == true && car.getModel() < 2015) {
			addParking(car);
		}
		return message;
	}

	public String[] vehicleType() {
		String[] report = new String[4];
		String reportG = "";
		String reportE = "";
		String reportH = "";
		String reportM = "";
		for (int i = 0; i < vehicles.size(); i++){
			if(vehicles.get(i) instanceof Gasoline){
				reportG = (reportG +vehicles.get(i).toString());
			}else if(vehicles.get(i) instanceof Electric){
				reportE = (reportE +vehicles.get(i).toString());
			}else if(vehicles.get(i) instanceof Hybrid){
				reportH = (reportH +vehicles.get(i).toString());
			}else if(vehicles.get(i) instanceof Motorcycle){
				reportM = (reportM +vehicles.get(i).toString());
			}    
		}
		report[0]= reportG;
		report[1]= reportE;
		report[2]= reportH;
		report[3]= reportM;

		return report;
	}

	public String[] fuelType() {
		String [] report = new String [3];
		String reportC = "";
		String reportE = "";
		String reportD = "";
		for (int i = 0; i < vehicles.size(); i++) {
			if(vehicles.get(i) instanceof Gasoline){
				Gasoline obj = (Gasoline)vehicles.get(i);
				if(obj.getGasolineType() == GasolineType.CORRIENTE){
					reportC = (reportC +vehicles.get(i).toString());
				}else if(obj.getGasolineType() == GasolineType.EXTRA) {
					reportE = (reportE +vehicles.get(i).toString());

				}else if(obj.getGasolineType() == GasolineType.DIESEL){
					reportD = (reportD +vehicles.get(i).toString());
				}
			}
		}
		report[0]= reportC;
		report[1]= reportE;
		report[2]= reportD;

		return report;
	}

	public String[] carsNewUsed() {
		String[] report = new String[2];
		String reportN = "";
		String reportU = "";
		for (int i = 0; i < vehicles.size(); i++){
			if(vehicles.get(i).getAlreadyUsed() == true)
				reportN = (reportN +vehicles.get(i).toString());
			else
				reportU = (reportU +vehicles.get(i).toString());
		}
		report[0]=reportN;
		report[1]=reportU;

		return report;
	}

	public String vehicleDocuments(String licensePlate) {
		String message = "This car doesn't have documents.";
		for (int i = 0; i < vehicles.size(); i++){
			if(vehicles.get(i).getLicensePlate().equals(licensePlate)){
				message = "";
				message = vehicles.get(i).document();
			}
		}
		return message;
	}

	public void addParking(Vehicle car) {
		boolean cont = true;
		for(int i = 0; i < parking.length; i++) {
			for(int j = 0; j < parking[i].length; j++) {
				if(parking[i][j] == null && cont == true) {
					if(car.getModel() == 2014 && j == 0) {
						parking [i][j] = car;
						cont = false;
					} else if(car.getModel() == 2013 && j == 1) {
						parking [i][j] = car;
						cont = false;
					} else if(car.getModel() == 2012 && j == 2) {
						parking [i][j] = car;
						cont = false;
					} else if(car.getModel() == 2011 && j == 3) {
						parking [i][j] = car;
						cont = false;
					} else if(car.getModel() < 2011 && j == 4) {
						parking [i][j] = car;
						cont = false;
					}
				}
			}
		}
	}

	public String parkingMap() {
		String message = "";
		boolean cont = true;
		for(int i = 0; i < parking.length; i++) {
			for(int j = 0; j < parking[i].length; j++) {
				if(parking[i][j] != null && parking[i][j].getModel() == 2014 && j == 0) {
					message += (" [" +parking[i][j].toString() +" ] ");
					cont = false;
				}
				if(parking[i][j] != null && parking[i][j].getModel() == 2013 && j == 1) {
					message += (" [" +parking[i][j].toString() +" ] ");
					cont = false;
				}
				if(parking[i][j] != null && parking[i][j].getModel() == 2012 && j == 2) {
					message += (" [" +parking[i][j].toString() +" ] ");
					cont = false;
				}
				if(parking[i][j] != null && parking[i][j].getModel() == 2011 && j == 3) {
					message += (" [" +parking[i][j].toString() +" ] ");
					cont = false;
				}
				if(parking[i][j] != null && parking[i][j].getModel() < 2011 && j == 4) {
					message += (" [" +parking[i][j].toString() +" ] ");
					cont = false;
				}
				if(parking[i][j] != null && cont == true) {
					message += (" [" +"Empty" +"-" +"Empty" +"-" +"Empty" +" ] ");
				}
				cont = true;
			}
			message += "\n";
		}
		return message;
	}
}

