package com.gardhagen.joakim.assignmentTwo.pyramid;

public class Pyramid {

	public static void main(String[] args) {

		
		/*
		 * Programmet fungerar så att man skapar 1 loop för att 
		 * flytta fram första triangeln med blanksteg.
		 * Därpå ställer man upp en andra triangel och sedan 
		 * speglar man den andra triangeln med en tredje triangel
		 * varpå man skriver ut värderna av looparnas index upphöjt till 3.
		 * 
		 * 
		 * 
		 * */
		int number = 8;
		for (int row = 0; row <= number; row++) {//yttre loop för att ställa upp rader
			for (int space = (number - row); space > 0; space--) {//loop för att flytta fram första visade triangeln
				System.out.print("\t");
			}
			for (int firstPart = 1; firstPart <= row; firstPart++) {//andra triangeln

				System.out.print("\t"+(int)Math.pow(3, firstPart -1));//srkiver ut värdet av indexet upphöjt med 3
			
			}
			for (int secondPart = row-1;secondPart >= 1; secondPart--) {	//tredje triangeln
				System.out.print("\t"+(int)Math.pow(3, secondPart-1)+" ");

			}
			
			System.out.println();
		
		}
	}
}