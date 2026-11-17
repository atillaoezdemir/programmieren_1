package Lektion5;

import java.util.Scanner;

public class Übung4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zahl: ");
		double wurzel = scanner.nextDouble();
		double guess = 1;
		double folge;
		
		for(int i = 0 ; i < 10001 ; i++) {
			folge = (guess + (wurzel / guess)) / 2;
			guess = folge;
			if(i == 3) 
				System.out.println((Math.sqrt(wurzel))-guess);
			if(i == 10) 
				System.out.println((Math.sqrt(wurzel))-guess);
			if(i == 100) 
				System.out.println((Math.sqrt(wurzel))-guess);
			if(i == 1000) 
				System.out.println((Math.sqrt(wurzel))-guess);
			if(i == 10000) {
				System.out.println((Math.sqrt(wurzel))-guess);
				break;
			}
		}
		scanner.close();
	}
}
