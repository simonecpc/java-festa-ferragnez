package com.ferragnez.party;

import java.util.Scanner; 

public class CheckGuest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String [] nomi = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		boolean flag = false;
		
		String nomeCognome;

		System.out.println("Inserisci il nome e cognome dell'invitato");
		nomeCognome = scan.nextLine();
		
		for (int i = 0; i < nomi.length;i++) {
			
			if (nomeCognome.equalsIgnoreCase(nomi [i])) {
				flag = true;
			}
			
		}
		
		if (flag == true){
			System.out.println("Bravo sai dentro");
		}
		else{
			System.out.println("Sei Fuori mi dispiace");
		}
	
		scan.close();
		
	}
		
}
