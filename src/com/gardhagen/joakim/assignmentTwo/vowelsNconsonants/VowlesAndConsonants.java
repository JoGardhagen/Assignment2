package com.gardhagen.joakim.assignmentTwo.vowelsNconsonants;

import java.util.Scanner;

public class VowlesAndConsonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vowels = 0;
		int constants = 0;
		int spaces = 0;
		
		String sentence = scan.nextLine();// tar emot en str�ng av anv�ndaren.
		for (int i = 0; i < sentence.length(); i++) {//st�ller upp str�ngen
			char ichar=sentence.charAt(i);
			//gemf�r om char �r en vokal
			if (ichar == 'a' || ichar == 'e' || ichar == 'i' || ichar == 'o' || ichar == 'u' 
					|| ichar == 'y' || ichar == '�' || ichar == '�'|| ichar == '�') {
				vowels++;//Om char �r en vokal �kar v�rdet av Vokal variabeln
			}
			//gemf�r om char �r en konsonat
			else if(ichar=='b'||ichar=='c'||ichar=='f'||ichar=='g'||ichar=='h'||ichar=='j'||ichar=='k'
					||ichar=='l'||ichar=='m'||ichar=='n'||ichar=='p'||ichar=='q'||ichar=='r'||ichar=='s'
					||ichar=='t'||ichar=='v'||ichar=='x'||ichar=='z') {
				constants++;//Om char �r en konsonat �kar v�rdet av Konsonat variabeln
			}
			else if(ichar==' ') {//Om char �r ett blanksteg �kar v�rdet av blankstegsvariabeln
				spaces++;
			}
			
		}
		//skriver ut antalet Vokaler ,Konsonater och blanksteg som finns i texten anv�ndaren skrivit in.
		System.out.println(vowels +" vokaler\n"+ constants+" konsonanter\n"+spaces +" mellanslag");
		scan.close();
	}

}
