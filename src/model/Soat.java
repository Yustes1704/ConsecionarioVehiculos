package model;

public class Soat extends Document{

	//atributes
	private double price;

	//methods
	public Soat(String number, double price, int year, String image) {
		super(number, year, image);
		this.price = price;
	}

	public String  generateNum() {
		int [][] matrixSoat= new int [4][4];
		for (int i = 0; i < matrixSoat.length; i++) {
			for (int j = 0; j < matrixSoat[0].length; j++) {
				int randomNumber = (int)(Math.random()*20+1);
				matrixSoat[i][j] = randomNumber;
			}
		}
		String message = "";
		for (int i = 0; i < matrixSoat.length; i++) {
			for (int j = 0; j < matrixSoat[0].length; j++) {
				if(j == 0){
					message =message+ "|"+ matrixSoat[i][j];
				}
				if(i == 3 && j != 0){
					message = message+ "|"+ matrixSoat[i][j];
				}

			}
		}
		return message;
	}
}
