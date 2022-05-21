package model;

public class OwnerCard extends Document{

	public OwnerCard(String number, int year, String image) {
		super(number, year, image);
	}

	public String generateNum() {
		int [][] matrixOwn= new int [4][4];
		for (int i = 0; i < matrixOwn.length; i++) {
			for (int j = 0; j < matrixOwn[0].length; j++) {
				int randomNumber = (int)(Math.random()*20+1);
				matrixOwn[i][j] = randomNumber;
			}
		}String message = "";
		for (int i= matrixOwn.length-1; i > 0; i--) {
			for (int j =  matrixOwn[0].length-1; j >= 0; j--) {
				if(i%2 != 0 && j%2 != 0){
					message = message+ "|"+ matrixOwn[i][j];
				}
				else if(i%2 == 0 && j%2 == 0){
					message = message+ "|"+ matrixOwn[i][j];
				}

			}
		}
		for (int i = 0; i < matrixOwn.length; i++) {
			for (int j = 0; j < matrixOwn.length; j++) {
				if(j == 2 && i==0){
					message = (message +"|" +matrixOwn[i][j]);
				}
			}
		}
		return message;
	}
}
