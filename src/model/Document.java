package model;

public abstract class Document {

	//atributes
	private String number;
	private int year;
	private String image;
	
	//methods
	public Document(String number, int year, String image) {
		if(number.equalsIgnoreCase("0"))
            this.number = generateNum();
		this.year = year;
		this.image = image;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public abstract String generateNum();
	
}
