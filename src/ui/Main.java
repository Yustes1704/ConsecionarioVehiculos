package ui;
import java.util.Scanner;

import model.Company;
import model.Vehicle;

public class Main {
	/**
	 * @author Juan Yustes <br>
	 * @date 2022
	 */
	public static final Scanner TECLADO = new Scanner(System.in);
	public static Company company = new Company("Company");
	/**
	 * Main method where menu appears <br>
	 * @param ar
	 */
	public static void main(String []ar) {
		int menu;
		do {
			System.out.println("Hello! What do you want to do?:");
			System.out.println("1. Register vehicle.");
			System.out.println("2. Vehicle info.");
			System.out.println("3. Vehicle documents.");
			System.out.println("4. Parking map.");
			menu = TECLADO.nextInt();
			TECLADO.nextLine();

			switch (menu){
			case 1:
				registerVehicle();
				break;
			case 2:
				vehicleInfo();
				break;
			case 3:
				vehicleDocuments();
				break;
			case 4:
				parkingMap();
				break;
			} 
		} while(menu < 4);
	}
	
	/**
	 * Method use to ask for car's data. <br>
	 */
	public static void registerVehicle() {
		String soatNum = "0";
		String technoNum = "0";
		boolean alreadyUsed;
		System.out.println("Is your vehicle already used? 1. Yes.  2. No.");
		int used = TECLADO.nextInt();
		if(used == 1) {
			alreadyUsed = true;
		} else {
			alreadyUsed = false;
		}
		System.out.println("Type vehicle's base price: ");
		double basePrice = TECLADO.nextDouble();
		System.out.println("Type vehicle's sell price: ");
		double sellPrice = TECLADO.nextDouble();
		TECLADO.nextLine();
		System.out.println("Type vehicle's trademark: ");
		String trademark = TECLADO.nextLine();
		System.out.println("Type vehicle's model: ");
		int model = TECLADO.nextInt();
		TECLADO.nextLine();
		System.out.println("Type vehicle's cilinder capacity: ");
		String cilinderCapacity = TECLADO.nextLine();
		System.out.println("Type vehicle's kilometers: ");
		String km = TECLADO.nextLine();
		System.out.println("Type vehicle's license plate: ");
		String licensePlate = TECLADO.nextLine();
		System.out.println("Now, what's your kind of vehicle?  1. Car.  2. Motorcycle.: ");
		int kind = TECLADO.nextInt();
		TECLADO.nextLine();
		System.out.println("How much money does the SOAT cover?");
		double soatPrice = TECLADO.nextDouble();
		System.out.println("What's the Soat's year of expedition?");
		int soatYear = TECLADO.nextInt();
		TECLADO.nextLine();
		System.out.println("What's the Soat's image?");
		String soatImage = TECLADO.nextLine();
		System.out.println("What's the Technomechanical's year of expedition?");
		int technoYear = TECLADO.nextInt();
		TECLADO.nextLine();
		System.out.println("What's the Technomechanical's image?");
		String technoImage = TECLADO.nextLine();
		System.out.println("What's the Owner Card's year of expedition?");
		int ownYear = TECLADO.nextInt();
		TECLADO.nextLine();
		System.out.println("What's the Owner Card's image?");
		String ownImage = TECLADO.nextLine();
		if(kind == 1) {
			System.out.println("Type car's door number: ");
			String numDoors = TECLADO.nextLine();
			System.out.println("Is your car polaryzed?  1. Yes.  2. No.");
			int polaryze = TECLADO.nextInt();
			TECLADO.nextLine();
			System.out.println("Type if your car is: 1. Sedan.  2.PickupTruck.");
			int carTyp = TECLADO.nextInt();
			TECLADO.nextLine();
			System.out.println("What's your kind of car?  1. Gasoline.  2. Electric.  3 Hybrid.:");
			int kindM = TECLADO.nextInt();
			TECLADO.nextLine();
			if(kindM == 1) {
				registerGasoline(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, 
						km, licensePlate, numDoors, polaryze, carTyp, soatPrice, soatYear, soatImage, technoYear,
						technoImage, soatNum, technoNum);
			} else {
				if(kindM == 2) {
					registerElectric(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, km,
							licensePlate, numDoors, polaryze, carTyp, soatPrice, soatYear, soatImage, technoYear, 
							technoImage, soatNum, technoNum);
				} else {
					registerHybrid(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, km, 
							licensePlate, numDoors, polaryze, carTyp, soatPrice, soatYear, soatImage, technoYear, 
							technoImage, soatNum, technoNum);
				}
			}
		} else {
			registerMotorcycle(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, km, 
					licensePlate, soatPrice, soatYear, soatImage, technoYear, technoImage, soatNum, technoNum);
		}
	}

	public static void registerGasoline(boolean alreadyUsed, double basePrice, double sellPrice, 
			String trademark, int model, String cilinderCapacity, String km, String licensePlate, 
			String numDoors, int polaryze, int carTyp, double soatPrice, int soatYear, String soatImage, 
			int technoYear, String technoImage, String soatNum, String technoNum) {
		System.out.println("Type car's gasoline capacity:");
		String gasolineCapacity = TECLADO.nextLine();
		System.out.println("Type car's gasoline consume: ");
		String gasolineConsume = TECLADO.nextLine();
		System.out.println("Type car's gasoline type: 1. Corriente.  2. Diesel.  3. Extra.");
		int gasolineTyp = TECLADO.nextInt();
		TECLADO.nextLine();
		String message = company.registerGasoline(alreadyUsed, basePrice, sellPrice, trademark, model, 
				cilinderCapacity, km, licensePlate, numDoors, polaryze, carTyp, soatPrice, soatYear, soatImage, 
				technoYear, technoImage, soatNum, technoNum, gasolineCapacity, gasolineConsume, gasolineTyp);
		System.out.println(message);
	}

	public static void registerElectric(boolean alreadyUsed, double basePrice, double sellPrice, String trademark,
			int model, String cilinderCapacity, String km, String licensePlate, String numDoors, int polaryze,
			int carTyp, double soatPrice, int soatYear, String soatImage, 
			int technoYear, String technoImage, String soatNum, String technoNum) {
		System.out.println("Type car's battery duration: ");
		String batteryDuration = TECLADO.nextLine();
		System.out.println("Type car's battery consume: ");
		String batteryConsume = TECLADO.nextLine();
		System.out.println("Type car's battery type: 1. Fast.  2. Normal.");
		int batteryTyp = TECLADO.nextInt();
		TECLADO.nextLine();
		String message = company.registerElectric(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity,
				km, licensePlate, numDoors, polaryze, carTyp,
				soatNum,soatPrice, soatYear, soatImage, technoNum, technoYear, technoImage, batteryDuration, 
				batteryConsume, batteryTyp);
		System.out.println(message);
	}

	public static void registerHybrid(boolean alreadyUsed, double basePrice, double sellPrice, String trademark, 
			int model, String cilinderCapacity, String km, String licensePlate, String numDoors, 
			int polaryze, int carTyp, double soatPrice, int soatYear, String soatImage, 
			int technoYear, String technoImage, String soatNum, String technoNum) {
		System.out.println("Type car's gasoline capacity:");
		String gasolineCapacity = TECLADO.nextLine();
		System.out.println("Type car's gasoline consume: ");
		String gasolineConsume = TECLADO.nextLine();
		System.out.println("Type car's gasoline type: 1. Corriente.  2. Diesel.  3. Extra.");
		int gasolineTyp = TECLADO.nextInt();
		TECLADO.nextLine();
		System.out.println("Type car's battery duration: ");
		String batteryDuration = TECLADO.nextLine();
		System.out.println("Type car's battery consume: ");
		String batteryConsume = TECLADO.nextLine();
		System.out.println("Type car's battery type: 1. Fast.  2. Normal.");
		int batteryTyp = TECLADO.nextInt();
		TECLADO.nextLine();
		String message = company.registerHybrid(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity,
				km, licensePlate, numDoors, polaryze, carTyp, soatPrice, soatYear, soatImage, technoYear, 
				technoImage, soatNum, technoNum, gasolineCapacity, gasolineConsume, gasolineTyp, batteryDuration,
				batteryConsume, batteryTyp);
		System.out.println(message);
	}

	public static void registerMotorcycle(boolean alreadyUsed, double basePrice, double sellPrice, String trademark,
			int model, String cilinderCapacity, String km, String licensePlate, double soatPrice, int soatYear, 
			String soatImage, int technoYear, String technoImage, String soatNum, String technoNum) {
		System.out.println("Type motorcycle's gasoline capacity:");
		String gasolineCapacity = TECLADO.nextLine();
		System.out.println("Type motorcycle's gasoline consume:");
		String gasolineConsume = TECLADO.nextLine();
		System.out.println("What's your kind of motorcycle? 1. Standard.  2. Sport.  3. Scooter.  4. Cross.");
		int motorcycleTyp = TECLADO.nextInt();
		TECLADO.nextLine();
		String message = company.registerMotorcycle(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity,
				km, licensePlate, soatPrice, soatYear, soatImage, technoYear, technoImage, soatNum, technoNum,
				gasolineCapacity, gasolineConsume, motorcycleTyp);
		System.out.println(message);
	}
	
	/**
	 * Method where the user can choose what kind of vehicle want to know the information. <br>
	 */
	public static void vehicleInfo() {
		System.out.println("Choose: 1. Type Vehicles.  2. Type Fuel.  3.Cars new o used.");
		int info = TECLADO.nextInt();
		TECLADO.nextLine();
		switch(info){
		case 1:
			String message = typeVehicle();
			System.out.println(message);
			break;
		case 2:
			String message2 = typeFuel();
			System.out.println(message2);
			break;
		case 3:
			String message3 = carsNewUsed();
			System.out.println(message3);
			break;
		}
	}

	public static String typeVehicle() {
		String[] report = company.vehicleType();
		String message = ("Gasoline: " +report[0] +" Electric: " +report[1] +" Hybrid: " +report[2] +" Motorcycle: " +report[3]);
		return message;
	}

	public static String typeFuel() {
		String[] report = company.fuelType();
		String message = ("Corriente: " +report[0] +" Extra: " +report[1] +" Diesel: " +report[2]);
		return message;
	}

	public static String carsNewUsed() {
		String[] report = company.carsNewUsed();
		String message = ("Used: " +report[0] +" New: " +report[1]);
		return message;
	}

	/**
	 * This method is for the user type license plate that want to know its documents. <br>
	 */
	public static void vehicleDocuments() {
		System.out.println("Type license plate you want to know:");
		String licensePlate = TECLADO.nextLine();
		String message = company.vehicleDocuments(licensePlate);
		System.out.println(message);
	}
	 
	/**
	 * This method print the parking map. <br>
	 */
	public static void parkingMap() {
		String message = company.parkingMap();
		System.out.println(message);
	}
}
