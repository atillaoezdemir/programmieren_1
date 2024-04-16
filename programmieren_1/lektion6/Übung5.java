package Lektion6;

import java.util.Scanner;

public class Übung5 {

	private static int potenz(int basis, int exponent) {
		if (exponent == 0)
			return 1;
		return basis * potenz((basis), (exponent - 1));
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Basis:");

		int basis = scanner.nextInt();

		System.out.println("Potenz:");

		int potenz = scanner.nextInt();
		
		System.out.println(potenz(basis , potenz));
	}
}
