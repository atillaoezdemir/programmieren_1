package klausursuebungen;

import java.util.Scanner;

public class Aufgabe2 {

	public static int bewege(int newLocation, String move) {
		
		if (move.equals("d")) {
			if (newLocation < 13)
				newLocation++;
			
		} else if (move.equals("a")) {
			if (newLocation > 0)
				newLocation--;
		}
		return newLocation;
	}

	public static void main(String[] args) {
		
		System.out.println("o o o o o o o o\n\n\n");
		int location = (int) (Math.random() * 14);
		int newLocation = location;
		
		while (location != 100) {
			int space = newLocation;
			while (space >= 0) {
				System.out.print(" ");
				space--;
			}
			
			System.out.println("V");
			Scanner scanner = new Scanner(System.in);
			String move = scanner.nextLine();
			
			if (move.equals("d") || move.equals("a"))
				newLocation = bewege(newLocation, move);
			
			else
				System.out.println("Invalid move, please enter 'd' or 'a'");
		}
	}
}
