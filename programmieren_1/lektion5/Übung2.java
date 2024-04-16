package Lektion5;

import java.util.Scanner;

public class Übung2 {
	public static void main(String[] args) {
	
		System.out.println("Basis: ");
		Scanner scanner = new Scanner(System.in);
		double b = scanner.nextDouble();
		System.out.println("Exponent: ");
		int n = scanner.nextInt();
		double folge = 1;
		
		if(n > 0) {
			do {
				folge = folge * b;
				n--;
			}while(n != 0);
		}
		
		else if(n < 0) {
			do {
				folge = folge * (1 / b);
				n++;
			}while(n != 0);
		}
		
		System.out.println(String.format("%.2f" , folge));
		
		scanner.close();
	}
}
