package Lektion3;

import java.util.Scanner;

public class StringCompareUndEquals {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie den ersten String ein:");
		String ersterString = scanner.nextLine();
		System.out.println("Bitte geben Sie den zweiten String ein:");
		String zweiterString = scanner.nextLine();
		
		if(ersterString.equals(zweiterString)) 
			System.out.println("Diese sind gleich!");
		else if(ersterString.compareTo(zweiterString) < 0) 
			System.out.println("Die erste String kommt im Alphabet vor dem zweiten String!");
		//else if(ersterString.compareTo(zweiterString) > 0) 
		//	System.out.println("Die zweite String kommt im Alphabet vor dem ersten String!");
		else 
		System.out.println("Die zweite String kommt im Alphabet vor dem ersten String!");
		
		scanner.close();
		}

}


