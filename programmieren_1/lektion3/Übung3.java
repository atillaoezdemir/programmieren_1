package Lektion3;

import java.util.Scanner;

public class Übung3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Einzelzeichen: ");
		char char1 = scanner.next().charAt(0);
        int int1 = char1;        
        
        if(int1 < 71 && int1 > 64)
        System.out.println("Das ist Grossbuchstabe, hexadezimale Ziffer");
        
        scanner.close();
	}
}
