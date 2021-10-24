package com.gardhagen.joakim.assignmentTwo.lotteri;

import java.util.Random;
import java.util.Scanner;
/*Programmet fungerar så att att det slumpar 2 tal 
 * och ber användaren att skriva in en gissning
 * varpå gissningen omvanldas till en sträng för att kunna dela up 
 * det inmatade talet i 2 dela för att sedan gemföra värderna med 
 * det dragna talet för att sedan skriva ut om man vunnit eller inte.
 * */
public final class Lotteri {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		//slumptalen dras 
		int firstNum = rand.nextInt(9);
		int secondNum = rand.nextInt(9);
		////////för test ////////
//		System.out.print(firstNum);
//		System.out.print(secondNum);
		System.out.println("\nSkriv in din gissning för dragning:");
		int input = scan.nextInt();//inmatningen sparas.
		String inputValue = String.valueOf(input);//värdet omvandlas till en sträng 
		// delar up strängen i var sin egen variabel
		int inputValueOne =Character.getNumericValue(inputValue.charAt(0));
		int inputValueTwo =Character.getNumericValue(inputValue.charAt(1));
		
		if(inputValueOne==firstNum && inputValueTwo==secondNum) {// gemför om indata är LIKA med det dragna numret
			System.out.println("Grattis till 10 000 Kr:-");
		}//gemför med om det inmatade stämmer överens med dragning i annan ordning
		else if(inputValueOne==secondNum&&inputValueTwo==firstNum) {
			System.out.println("Grattis till 5000 Kr:-");
		}//gemför om indatan stämmer överns någon av de 2 dragna talen 
		else if(((inputValueOne==firstNum ||inputValueOne==secondNum)
				&&(inputValueTwo!=firstNum||inputValueTwo!=secondNum))
				||(((inputValueTwo==firstNum||inputValueTwo==secondNum)
						&&(inputValueOne!=firstNum||inputValueOne!=secondNum)))) {
			System.out.println("Grattis till 1000 Kr:-");
		}
		else 
			System.out.println("Tyvärr ingen Vinst...");
		scan.close();
	}

}
