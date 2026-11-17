package Lektion5;

import java.util.Scanner;

public class Übung5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Die Anzahl der Rechtecke: ");
		double n = scanner.nextDouble();
		double folge;
		double a = 0;
		double summe = 0;
		
		do {
			folge = 1 / n * (Math.sqrt(1 - Math.pow(a/n, 2)));
			summe = summe + folge;
			a++;
		}while(a < n);
		
		System.out.println("Pi: " + 4 * summe);
		scanner.close();
	}
}
