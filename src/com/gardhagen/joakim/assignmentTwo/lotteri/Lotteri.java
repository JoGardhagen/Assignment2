package com.gardhagen.joakim.assignmentTwo.lotteri;

import java.util.Random;
import java.util.Scanner;
/*Programmet fungerar s� att att det slumpar 2 tal 
 * och ber anv�ndaren att skriva in en gissning
 * varp� gissningen omvanldas till en str�ng f�r att kunna dela up 
 * det inmatade talet i 2 dela f�r att sedan gemf�ra v�rderna med 
 * det dragna talet f�r att sedan skriva ut om man vunnit eller inte.
 * */
public final class Lotteri {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		//slumptalen dras 
		int firstNum = rand.nextInt(9);
		int secondNum = rand.nextInt(9);
		////////f�r test ////////
//		System.out.print(firstNum);
//		System.out.print(secondNum);
		System.out.println("\nSkriv in din gissning f�r dragning:");
		int input = scan.nextInt();//inmatningen sparas.
		String inputValue = String.valueOf(input);//v�rdet omvandlas till en str�ng 
		// delar up str�ngen i var sin egen variabel
		int inputValueOne =Character.getNumericValue(inputValue.charAt(0));
		int inputValueTwo =Character.getNumericValue(inputValue.charAt(1));
		
		if(inputValueOne==firstNum && inputValueTwo==secondNum) {// gemf�r om indata �r LIKA med det dragna numret
			System.out.println("Grattis till 10 000 Kr:-");
		}//gemf�r med om det inmatade st�mmer �verens med dragning i annan ordning
		else if(inputValueOne==secondNum&&inputValueTwo==firstNum) {
			System.out.println("Grattis till 5000 Kr:-");
		}//gemf�r om indatan st�mmer �verns n�gon av de 2 dragna talen 
		else if(((inputValueOne==firstNum ||inputValueOne==secondNum)
				&&(inputValueTwo!=firstNum||inputValueTwo!=secondNum))
				||(((inputValueTwo==firstNum||inputValueTwo==secondNum)
						&&(inputValueOne!=firstNum||inputValueOne!=secondNum)))) {
			System.out.println("Grattis till 1000 Kr:-");
		}
		else 
			System.out.println("Tyv�rr ingen Vinst...");
		scan.close();
	}

}
