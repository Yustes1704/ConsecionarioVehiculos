package model;

public class Technomechanic extends Document {

	//methods
	public Technomechanic(String number, int year, String image) {
		super(number, year, image);
	}

	public String generateNum() {
		int [][] matrixTechno= new int [4][4];
		boolean aux = true;
		for(int i = 0; i < matrixTechno.length; i++) {
			for(int j = 0; j < matrixTechno[0].length; j++) {
				int randomNumber = (int)(Math.random()*20+1);
				matrixTechno[i][j] = randomNumber;
			}
		}
		String message = "";
		for(int i = 0; i < matrixTechno.length; i++) {
			for(int j = 0; j < matrixTechno[0].length; j++) {
				if(i == 0){
					message =message+ "|"+ matrixTechno[i][j];
				}

			}
		} 
		for (int j = matrixTechno.length-1; j > 0; j--) {
			aux = true;
			for (int i = 0; i < matrixTechno.length && aux != false; i++) {
				if(j != 3){
					message = (message +"|" + matrixTechno[j][i]);
					aux = false;
				}
			}
		}
		for (int i = 3; i < matrixTechno.length; i++) {
			for (int j = 0; j < matrixTechno[0].length; j++) {
				message =message+ "|"+ matrixTechno[i][j];
			}
		}
		return message;
	}
}
