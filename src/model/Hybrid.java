package model;

public class Hybrid extends Car {
	
	//atributes
	private String gasolineCapacity;
	private String gasolineConsume;
	private String batteryDuration;
	private String batteryConsume;
	
	//relations
	private GasolineType gasolineType;
	private ChargerType chargerType;
	
	//methods
	public Hybrid(boolean alreadyUsed, double basePrice, double sellPrice, String trademark, String model,
			String cilinderCapacity, String km, String licensePlate, String numDoors, int carTyp, int polaryze,
			String soatNumber,double soatPrice, int soatYear,String soatImage,String technoNum, 
	        int technoYear,String tehnoImage, String gasolineCapacity, String gasolineConsume, 
			String batteryDuration, String batteryConsume,
			int gasolineTyp, int chargerTyp) {
		super(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, km, licensePlate, numDoors, carTyp,
				polaryze, soatNumber, soatPrice, soatYear, soatImage, technoNum, technoYear, tehnoImage);
		this.gasolineCapacity = gasolineCapacity;
		this.gasolineConsume = gasolineConsume;
		this.batteryDuration = batteryDuration;
		this.batteryConsume = batteryConsume;
		
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
		
		switch (chargerTyp) {
		case 1:
			chargerType = ChargerType.FAST;
			break;
		case 2:
			chargerType = ChargerType.NORMAL;
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

	public String getBatteryDuration() {
		return batteryDuration;
	}

	public void setBatteryDuration(String batteryDuration) {
		this.batteryDuration = batteryDuration;
	}

	public String getBatteryConsume() {
		return batteryConsume;
	}

	public void setBatteryConsume(String batteryConsume) {
		this.batteryConsume = batteryConsume;
	}

	public GasolineType getGasolineType() {
		return gasolineType;
	}

	public void setGasolineType(GasolineType gasolineType) {
		this.gasolineType = gasolineType;
	}

	public ChargerType getChargerType() {
		return chargerType;
	}

	public void setChargerType(ChargerType chargerType) {
		this.chargerType = chargerType;
	}
	
	public String toString() {
        return (super.toString()+"\nBattery Consume:" +batteryConsume +"\nBattery Duration:" +batteryDuration
                +"\nGasoline Capacity:" +gasolineCapacity +"\nGasolineConsume:" +gasolineConsume +"\nType Charger:"
                +chargerType +"\nType Gasoline:" +gasolineType);
    }
}
