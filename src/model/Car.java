package model;

public class Car extends Vehicle {

	//atributes
	private String numDoors;
	
	//relations
	private CarType carType;
	private Polaryzed polaryzed;
		
	//methods
	public Car(boolean alreadyUsed, double basePrice, double sellPrice, String trademark, int model,
			String cilinderCapacity, String km, String licensePlate, String numDoors, int carTyp,
			int polaryze, String soatNumber,double soatPrice, int soatYear, String soatImage, String technoNum, 
			int technoYear,String technoImage) {
		super(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, km, licensePlate, soatNumber, soatPrice, soatYear, technoNum, soatImage, technoYear, technoImage);
		this.numDoors = numDoors;
		
		switch (carTyp) {
		case 1:
			carType = CarType.SEDAN;
			break;
		case 2:
			carType = CarType.PICKUPTRUCK;
		}
		
		switch (polaryze) {
		case 1:
			polaryzed = Polaryzed.POLARYZED;
			break;
		case 2:
			polaryzed = Polaryzed.NONPOLARYZED;
		}
	}

	public String getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(String numDoors) {
		this.numDoors = numDoors;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public Polaryzed getPolaryzed() {
		return polaryzed;
	}

	public void setPolaryzed(Polaryzed polaryzed) {
		this.polaryzed = polaryzed;
	}
	
	public String toString() {
        return (super.toString()+"\nNumber Doors:" +numDoors +"\nPolarized:" +polaryzed +"\nType Car:" +carType);
    }
}
