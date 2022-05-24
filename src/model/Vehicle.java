package model;
public abstract class Vehicle {

	//atributes
	private boolean alreadyUsed;
	private double basePrice;
	private double sellPrice;
	private String trademark;
	private int model;
	private String cilinderCapacity;
	private String km;
	private String licensePlate;
	
	//Relation
	private Document [] documents;
	
	//methods
	public Vehicle(boolean alreadyUsed, double basePrice, double sellPrice, String trademark, int model,
			String cilinderCapacity, String km, String licensePlate, String soatNumber,double soatPrice,
	        int soatYear,String soatImage,String technoNum, int technoYear,String tehnoImage) {
		this.alreadyUsed = alreadyUsed;
		this.basePrice = basePrice;
		this.sellPrice = sellPrice;
		this.trademark = trademark;
		this.model = model;
		this.cilinderCapacity = cilinderCapacity;
		this.km = km;
		this.licensePlate = licensePlate;
		this.documents = new Document[3];
        documents[0] = soat(soatNumber, soatPrice, soatYear, soatImage);
        documents[1] = techno(technoNum, technoYear, tehnoImage);
	}

	public boolean getAlreadyUsed() {
		return alreadyUsed;
	}

	public void setAlreadyUsed(boolean alreadyUsed) {
		this.alreadyUsed = alreadyUsed;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getCilinderCapacity() {
		return cilinderCapacity;
	}

	public void setCilinderCapacity(String cilinderCapacity) {
		this.cilinderCapacity = cilinderCapacity;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Document[] getDocuments() {
		return documents;
	}

	public void setDocuments(Document[] documents) {
		this.documents = documents;
	}
	
	public Soat soat(String soatNumber, double soatPrice, int soatYear, String soatImage){
	            Soat soat = new Soat(soatNumber,soatPrice, soatYear, soatImage);
	            return soat;
	    }

	    public Technomechanic techno(String technoNumber, int technoYear,
	        String technoImage){
	            Technomechanic technomechanic = new Technomechanic(technoNumber, technoYear, technoImage);
	            return technomechanic;
	    }
	    
	    public String toString() {
	        return ("Already Used:" +alreadyUsed +"\nBase Price:" +basePrice +"\nCilinder Capacity:"
	                    +cilinderCapacity +"\nKilometers:" +km +"\nMark:" +trademark +"\nModel:" +model +"\nPlaca:"
	                    +licensePlate +"\nSellPrice:" +sellPrice);
	        }
	    
	    public String document() {
	    	String message = "";
	        for (int i = 0; i < documents.length-1; i++) {
	            message = message+documents[i].toString();
	        }
	        return message;
	    }
}