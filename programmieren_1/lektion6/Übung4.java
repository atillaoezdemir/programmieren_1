package Lektion6;

import java.util.Scanner;

public class Übung4 {

	private static boolean istPrimZahlen(int zahl) {
		int divisor = zahl - 1;

		while (zahl > 1 && zahl % divisor != 0)
			divisor--;

		if (divisor == 1)
			return true;

		else
			return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Geben Sie ein Zahl ein: ");
		int zahl = scanner.nextInt();
		System.out.println(istPrimZahlen(zahl));
		scanner.close();
	}
}
