package Lektion4;

import java.util.Scanner;

public class Übung5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sie bitte eine Zahl ein: ");
		int zahl = scanner.nextInt();
		int zahl2 = zahl;
		int Querprodukt = 1;
		
		if(zahl <= 100000 && zahl >= 1) { 
			while(zahl2 > 0) {		
				Querprodukt = Querprodukt * (zahl2 % 10);
				zahl2 = zahl2/10;
				if(zahl2 == 0) {
					System.out.println("Das Querprodukt der Zahl " + zahl + " betraegt. " + Querprodukt);
				}
			}
		}
			
		else 
			System.out.println("FEHLER! Zahl ist ungueltig!");
		
		scanner.close();
	}
}
