package Lektion4;

import java.util.Scanner;

public class Übung2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sekunde: ");
		double t = scanner.nextDouble();
		double g = 9.80665;

		for (int t2 = 1 ; t2 <= t; t2++) {
			double Strecke = 0.5 * g * t2 * t2;
			System.out.println(t2 + ". Sekunden Zurueckgelegte Strecke ist: " + Strecke + "m");			
		}
		
		scanner.close();
	}
}
