package Lektion3;

import java.util.Scanner;

public class CharAndLine {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//System.out.print("Bitte geben Sie eine Zahl ein: ");
		//int x = scanner.nextInt();
		System.out.print("Bitte geben Sie einen String ein: ");
		String line = scanner.nextLine();
		char c = line.charAt(0);
		System.out.println("Und haben Sie " + line + " gesagt.");
		System.out.println("Und haben Sie erst " + c + " gesagt.");
		scanner.close();
	}

}
