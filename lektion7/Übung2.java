package Lektion7;

import java.util.Scanner;

public class Übung2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie viel Zahl: ");
		int zahlNummer = scanner.nextInt();
		
		int Zahlen[] = new int [zahlNummer];
		
		for(int i = 0 ; i < zahlNummer ; i++) {
			System.out.print((i + 1) + ". Zahl: ");
			Zahlen[i] = scanner.nextInt();
		}
	}
}
