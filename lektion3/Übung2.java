package Lektion3;

import java.util.Scanner;

public class Übung2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        	System.out.print("1. pizza price: ");
        	double pizza1p = scanner.nextFloat();
        	System.out.print("1. pizza ratio: ");
        	double pizza1r = scanner.nextFloat();

        	System.out.print("2. pizza price: ");
        	double pizza2p = scanner.nextFloat();
        	System.out.print("2. pizza ratio: ");
        	double pizza2r = scanner.nextFloat();

        	double erste = ((Math.PI * (Math.sqrt(pizza1r / 2f)) / pizza1p));
        	double zweite = ((Math.PI * (Math.sqrt(pizza2r / 2f)) / pizza2p));

        	if (erste < zweite) System.out.println("Zweite ist sinnvoll!");
        	else if (erste == zweite) System.out.println("Beide sind gleich!");
        	else System.out.println("Erste ist sinnvoll!");

        	scanner.close();
    	}
}

