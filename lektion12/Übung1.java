package Lektion12;

public class Übung1 {
	public static void main(String args[]) {
		for (int i = 1; i < 50; i++) {
			Knoten.add(i);
		}
		for (int i = 7; i != 0; i--) {
			Knoten.delete();
			Knoten.Listele();
			System.out.println();
		}
	}
}