package Lektion4;

import java.util.Scanner;

public class Übung3a {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Geben Sie ein Zahl ein: ");
		int zahl = scanner.nextInt();
		int divisor = zahl-1;
		
		while(zahl > 1 && zahl % divisor != 0)
			divisor--;
		
		if(divisor==1)
			System.out.println("Ja, das ist eine Primzahl!");
		
		else 
			System.out.println("Nein, das ist keine Primzahl!");
		
		scanner.close();
	}
}


