package Lektion7;

import java.util.Scanner;

public class Übung1 {

	public static double sin(double x) {
		
		double zaehler = 1.0;
		double nenner = 1.0;
		double summe = 0.0;
		double summand = 1.0;
		
		for(int i = 0; summand < -1E-15 || summand > 1E-15 ; i++) {
			if(i == 0) {
				zaehler = zaehler * x;
				summand = zaehler;
				summe = summe + summand;
			}
				
			else {
				zaehler = zaehler * x * x * (-1);
				nenner = nenner * (2 * i + 1) * (2 * i);
				summand = zaehler / nenner;
				summe = summe + summand;
			}
		}
		return summe;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zahl: ");
		double x = scanner.nextDouble();
		System.out.printf("Sin(" + x + "rad): " + "%.2f" , sin(x));
		scanner.close();
	}
}


