package model;

public class Electric extends Car {

	//atributes
	private String batteryDuration;
	private String batteryConsume;

	//relation
	private ChargerType chargerType;

	//methods
	public Electric(boolean alreadyUsed, double basePrice, double sellPrice, String trademark, String model,
			String cilinderCapacity, String km, String licensePlate, String numDoors, int carTyp, int polaryze, 
			String soatNumber,double soatPrice, int soatYear,String soatImage,
	        String technoNum, int technoYear,String tehnoImage,
			String batteryDuration, String batteryConsume, int chargerTyp) {
		super(alreadyUsed, basePrice, sellPrice, trademark, model, cilinderCapacity, km, licensePlate, numDoors, carTyp,
				polaryze, soatNumber, soatPrice, soatYear, soatImage, technoNum, technoYear, tehnoImage);
		this.batteryDuration = batteryDuration;
		this.batteryConsume = batteryConsume;

		switch (chargerTyp) {
		case 1:
			chargerType = ChargerType.FAST;
			break;
		case 2:
			chargerType = ChargerType.NORMAL;
			break;
		}
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

	public ChargerType getChargerType() {
		return chargerType;
	}

	public void setChargerType(ChargerType chargerType) {
		this.chargerType = chargerType;
	}
	
	public String toString() {
        return (super.toString()+"\nBattery Consume:" +batteryConsume +"\nBattery Duration:" +batteryDuration +"\nType Charger:"
                +chargerType);
    }
}
