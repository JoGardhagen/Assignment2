package com.gardhagen.joakim.assignmentTwo.vowelsNconsonants;

import java.util.Scanner;

public class VowlesAndConsonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vowels = 0;
		int constants = 0;
		int spaces = 0;
		
		String sentence = scan.nextLine();// tar emot en sträng av användaren.
		for (int i = 0; i < sentence.length(); i++) {//ställer upp strängen
			char ichar=sentence.charAt(i);
			//gemför om char är en vokal
			if (ichar == 'a' || ichar == 'e' || ichar == 'i' || ichar == 'o' || ichar == 'u' 
					|| ichar == 'y' || ichar == 'å' || ichar == 'ä'|| ichar == 'ö') {
				vowels++;//Om char är en vokal ökar värdet av Vokal variabeln
			}
			//gemför om char är en konsonat
			else if(ichar=='b'||ichar=='c'||ichar=='f'||ichar=='g'||ichar=='h'||ichar=='j'||ichar=='k'
					||ichar=='l'||ichar=='m'||ichar=='n'||ichar=='p'||ichar=='q'||ichar=='r'||ichar=='s'
					||ichar=='t'||ichar=='v'||ichar=='x'||ichar=='z') {
				constants++;//Om char är en konsonat ökar värdet av Konsonat variabeln
			}
			else if(ichar==' ') {//Om char är ett blanksteg ökar värdet av blankstegsvariabeln
				spaces++;
			}
			
		}
		//skriver ut antalet Vokaler ,Konsonater och blanksteg som finns i texten användaren skrivit in.
		System.out.println(vowels +" vokaler\n"+ constants+" konsonanter\n"+spaces +" mellanslag");
		scan.close();
	}

}
