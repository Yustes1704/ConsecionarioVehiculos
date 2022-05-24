package model;

public class Motorcycle extends Vehicle {

	//atributes
	private String gasolineCapacity;
	private String gasolineConsume;

	//relation
	private MotorcycleType motorcycleType;

	//methods
	public Motorcycle(boolean alreadyUsed, double basePrice, double sellPrice, String trademark, int model,
			String cilinderCapacity, String km, String licensePlate, String gasolineCapacity, String gasolineConsume,
			int motorcycleTyp, String soatNumber,double soatPrice, int soatYear, String soatImage,
			String technoNum, int technoYear,String tehnoImage) {
		super(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, km, licensePlate, soatNumber, soatPrice, soatYear, soatImage, tehnoImage, technoYear, technoNum);
		this.gasolineCapacity = gasolineCapacity;
		this.gasolineConsume = gasolineConsume;
		
		switch (motorcycleTyp) {
		case 1:
			motorcycleType = MotorcycleType.STANDARD;
			break;
		case 2:
			motorcycleType = MotorcycleType.SPORT;
			break;
		case 3:
			motorcycleType = MotorcycleType.SCOOTER;
			break;
		case 4:
			motorcycleType = MotorcycleType.CROSS;
			break;
		}
	}

	public String getGasolineCapacity() {
		return gasolineCapacity;
	}

	public void setGasolineCapacity(String gasolineCapacity) {
		this.gasolineCapacity = gasolineCapacity;
	}

	public String getGasolineConsume() {
		return gasolineConsume;
	}

	public void setGasolineConsume(String gasolineConsume) {
		this.gasolineConsume = gasolineConsume;
	}

	public MotorcycleType getMotorcycleType() {
		return motorcycleType;
	}

	public void setMotorcycleType(MotorcycleType motorcycleType) {
		this.motorcycleType = motorcycleType;
	}

	public String toString() {
        return (super.toString()+"\nGasoline Capacity:" +gasolineCapacity +"\nGasolineConsume:" +gasolineConsume
                +"\nType Motocycle" +motorcycleType);
    }
}
