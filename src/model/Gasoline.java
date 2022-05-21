package model;

public class Gasoline extends Car {

	//atributes
	private String gasolineCapacity;
	private String gasolineConsume;
	
	//relation
	private GasolineType gasolineType;
	
	//methods
	public Gasoline(boolean alreadyUsed, double basePrice, double sellPrice, String trademark, String model,
			String cilinderCapacity, String km, String licensePlate, String numDoors, int carTyp, int polaryze,
			String soatNumber, double soatPrice, int soatYear,String soatImage,String technoNum, 
	        int technoYear,String technoImage, String gasolineCapacity, String gasolineConsume, int gasolineTyp) {
		super(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, km, licensePlate, numDoors, carTyp,
				polaryze, soatNumber, soatPrice, soatYear, soatImage, technoNum, technoYear, technoImage);
		this.gasolineCapacity = gasolineCapacity;
		this.gasolineConsume = gasolineConsume;
		
		switch (gasolineTyp) {
		case 1:
			gasolineType = GasolineType.CORRIENTE;
			break;
		case 2:
			gasolineType = GasolineType.DIESEL;
			break;
		case 3: 
			gasolineType = GasolineType.EXTRA;
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

	public GasolineType getGasolineType() {
		return gasolineType;
	}

	public void setGasolineType(GasolineType gasolineType) {
		this.gasolineType = gasolineType;
	}
	
	public String toString() {
        return (super.toString()+"\nGasoline Capacity:" +gasolineCapacity +"\nGasoline Consume:" +gasolineConsume
                +"\nType Gasoline:" +gasolineType);
    }
}
