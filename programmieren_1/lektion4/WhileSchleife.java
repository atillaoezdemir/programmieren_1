package Lektion4;

import java.util.Scanner;

public class WhileSchleife {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie ein number ein: ");
		int number = scanner.nextInt();
		int total = 0;
		
		while (number>0) {
			total = total + number % 10;
			number= number / 10;
		}
		
		System.out.println("Total: " + total);
		
		scanner.close();	
	}
}
