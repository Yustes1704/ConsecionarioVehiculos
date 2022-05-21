package ui;
import java.util.Scanner;

import model.Company;

public class Main {
	public static final Scanner TECLADO = new Scanner(System.in);
	public static Company company = new Company("Company");

	public static void main(String []ar) {
		int menu;
		do {
			System.out.println("Hello! What do you want to do?:");
			System.out.println("1. Register vehicle.");
			System.out.println("2. Calculate total price.");
			System.out.println("3. Vehicle info.");
			System.out.println("4. Vehicle documents.");
			System.out.println("5. Parking map");
			System.out.println("6. Parking info.");
			menu = TECLADO.nextInt();
			TECLADO.nextLine();

			switch (menu){
			case 1:
				registerVehicle();
				break;
			case 2:
				totalPrice();
				break;
			case 3:
				vehicleInfo();
				break;
			case 4:
				//vehicleDocuments();
				break;
			case 5:
				//parkingMap();
				break;
			case 6:
				//parkingInfo();
				break;
			} 
		} while(menu<6);
	}
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
		System.out.println("Type vehicle's trademark: ");
		String trademark = TECLADO.nextLine();
		System.out.println("Type vehicle's model: ");
		String model = TECLADO.nextLine();
		System.out.println("Type vehicle's cilinder capacity: ");
		String cilinderCapacity = TECLADO.nextLine();
		System.out.println("Type vehicle's kilometers: ");
		String km = TECLADO.nextLine();
		System.out.println("Type vehicle's license plate: ");
		String licensePlate = TECLADO.nextLine();
		System.out.println("Now, what's your kind of vehicle?  1. Car.  2. Motorcycle.: ");
		int kind = TECLADO.nextInt();
		System.out.println("How much money does the SOAT cover?");
        double soatPrice = TECLADO.nextDouble();
        System.out.println("What's the Soat's year of expedition?");
        int soatYear = TECLADO.nextInt();
        TECLADO.nextLine();
        System.out.println("What's the Soat's image?");
        String soatImage = TECLADO.nextLine();
        System.out.println("What's the Mechanical Technique's year of expedition?");
        int technoYear = TECLADO.nextInt();
        TECLADO.nextLine();
        System.out.println("What's the Mechanical Technique's image?");
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
			System.out.println("Type if your car is: 1. Sedan.  2.PickupTruck.");
			int carTyp = TECLADO.nextInt();
			System.out.println("What's your kind of car?  1. Gasoline.  2. Electric.  3 Hybrid.:");
			int kindM = TECLADO.nextInt();
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
			String trademark, String model, String cilinderCapacity, String km, String licensePlate, 
			String numDoors, int polaryze, int carTyp, double soatPrice, int soatYear, String soatImage, 
			int technoYear, String technoImage, String soatNum, String technoNum) {
		System.out.println("Type car's gasoline capacity:");
		String gasolineCapacity = TECLADO.nextLine();
		System.out.println("Type car's gasoline consume: ");
		String gasolineConsume = TECLADO.nextLine();
		System.out.println("Type car's gasoline type: 1. Corriente.  2. Diesel.  3. Extra.");
		int gasolineTyp = TECLADO.nextInt();
		String message = company.registerGasoline(alreadyUsed, basePrice, sellPrice, trademark, model, 
				cilinderCapacity, km, licensePlate, numDoors, polaryze, carTyp, soatPrice, soatYear, soatImage, 
				technoYear, technoImage, soatNum, technoNum, gasolineCapacity, gasolineConsume, gasolineTyp);
		System.out.println(message);
	}
	
	public static void registerElectric(boolean alreadyUsed, double basePrice, double sellPrice, String trademark,
			String model, String cilinderCapacity, String km, String licensePlate, String numDoors, int polaryze,
			int carTyp, double soatPrice, int soatYear, String soatImage, 
			int technoYear, String technoImage, String soatNum, String technoNum) {
		System.out.println("Type car's battery duration: ");
		String batteryDuration = TECLADO.nextLine();
		System.out.println("Type car's battery consume: ");
		String batteryConsume = TECLADO.nextLine();
		System.out.println("Type car's battery type: 1. Fast.  2. Normal.");
		int batteryTyp = TECLADO.nextInt();
		String message = company.registerElectric(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity,
				km, licensePlate, numDoors, polaryze, carTyp,
				soatNum,soatPrice, soatYear, soatImage, technoNum, technoYear, technoImage, batteryDuration, 
				batteryConsume, batteryTyp);
		System.out.println(message);
	}
	
	public static void registerHybrid(boolean alreadyUsed, double basePrice, double sellPrice, String trademark, 
			String model, String cilinderCapacity, String km, String licensePlate, String numDoors, 
			int polaryze, int carTyp, double soatPrice, int soatYear, String soatImage, 
			int technoYear, String technoImage, String soatNum, String technoNum) {
		System.out.println("Type car's gasoline capacity:");
		String gasolineCapacity = TECLADO.nextLine();
		System.out.println("Type car's gasoline consume: ");
		String gasolineConsume = TECLADO.nextLine();
		System.out.println("Type car's gasoline type: 1. Corriente.  2. Diesel.  3. Extra.");
		int gasolineTyp = TECLADO.nextInt();
		System.out.println("Type car's battery duration: ");
		String batteryDuration = TECLADO.nextLine();
		System.out.println("Type car's battery consume: ");
		String batteryConsume = TECLADO.nextLine();
		System.out.println("Type car's battery type: 1. Fast.  2. Normal.");
		int batteryTyp = TECLADO.nextInt();
		String message = company.registerHybrid(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity,
				km, licensePlate, numDoors, polaryze, carTyp, soatPrice, soatYear, soatImage, technoYear, 
				technoImage, soatNum, technoNum, gasolineCapacity, gasolineConsume, gasolineTyp, batteryDuration,
				batteryConsume, batteryTyp);
		System.out.println(message);
	}
	
	public static void registerMotorcycle(boolean alreadyUsed, double basePrice, double sellPrice, String trademark,
			String model, String cilinderCapacity, String km, String licensePlate, double soatPrice, int soatYear, 
			String soatImage, int technoYear, String technoImage, String soatNum, String technoNum) {
		System.out.println("Type motorcycle's gasoline capacity:");
		String gasolineCapacity = TECLADO.nextLine();
		System.out.println("Type motorcycle's gasoline consume:");
		String gasolineConsume = TECLADO.nextLine();
		System.out.println("What's your kind of motorcycle? 1. Standard.  2. Sport.  3. Scooter.  4. Cross.");
		int motorcycleTyp = TECLADO.nextInt();
		String message = company.registerMotorcycle(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity,
				km, licensePlate, soatPrice, soatYear, soatImage, technoYear, technoImage, soatNum, technoNum,
				gasolineCapacity, gasolineConsume, motorcycleTyp);
		System.out.println(message);
	}
	
	public static void vehicleInfo() {
		System.out.println("Choose: 1. Type Vehicles.  2. Type Fuel.  3.Cars new o used.");
        int info = TECLADO.nextInt();
        TECLADO.nextLine();
        switch(info){
            case 1:
                String message = company.typeVehicle();
                System.out.println(message);
                break;
            case 2:
                typeFuel();
                break;
            case 3:
                carsNewUsed();
                break;
        }
	}
}
