package Lektion3;

import java.util.Scanner;

public class Bedingungsoperator {
	public static void main(String[] args) {
		
		// Variable = boolischer Ausdruck ? true Ausdruck : false Ausdruck;
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int max = (x < y) ? y : x;
		System.out.println("Max ist: " + max);
		
		scanner.close();
	}
}
