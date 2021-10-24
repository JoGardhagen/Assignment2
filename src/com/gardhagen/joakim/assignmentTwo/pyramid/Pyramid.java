package com.gardhagen.joakim.assignmentTwo.pyramid;

public class Pyramid {

	public static void main(String[] args) {

		
		/*
		 * Programmet fungerar s� att man skapar 1 loop f�r att 
		 * flytta fram f�rsta triangeln med blanksteg.
		 * D�rp� st�ller man upp en andra triangel och sedan 
		 * speglar man den andra triangeln med en tredje triangel
		 * varp� man skriver ut v�rderna av looparnas index upph�jt till 3.
		 * 
		 * 
		 * 
		 * */
		int number = 8;
		for (int row = 0; row <= number; row++) {//yttre loop f�r att st�lla upp rader
			for (int space = (number - row); space > 0; space--) {//loop f�r att flytta fram f�rsta visade triangeln
				System.out.print("\t");
			}
			for (int firstPart = 1; firstPart <= row; firstPart++) {//andra triangeln

				System.out.print("\t"+(int)Math.pow(3, firstPart -1));//srkiver ut v�rdet av indexet upph�jt med 3
			
			}
			for (int secondPart = row-1;secondPart >= 1; secondPart--) {	//tredje triangeln
				System.out.print("\t"+(int)Math.pow(3, secondPart-1)+" ");

			}
			
			System.out.println();
		
		}
	}
}