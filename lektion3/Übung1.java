package Lektion3;

import java.util.Scanner;

public class Übung1 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte geben Sie ein Zahl ein: ");
		float x = scanner.nextFloat();
	
		if(x % 7f != 0) System.out.println("Diese Zahl ist nicht mit 7 teilbar.");
		else System.out.println("Diese Zahl ist mit 7 teilbar.");
	
		// What if negative number is given?
	
		scanner.close();	
	}
}
