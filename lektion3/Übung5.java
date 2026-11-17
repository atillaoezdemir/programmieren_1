package Lektion3;

import java.util.Scanner;

2public class Übung5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Jahr: ");
		int Jahr = scanner.nextInt();
		
		if(Jahr % 400 == 0)System.out.println("Schaltjahr");
		else if(Jahr % 4 == 0 && Jahr % 100 != 0)System.out.println("Schaltjahr");
		else System.out.println("Kein Scahltjahr");
		
		scanner.close();
	}
	//Brainstorming: How to create a meaningful Exception?
}
