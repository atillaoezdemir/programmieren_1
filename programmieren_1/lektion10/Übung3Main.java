package Lektion10;

public class Übung3Main {
	public static void main(String[] args) {

		Übung3Auto Auto1 = new Übung3Auto("Mercedes", "Schwarz", 1000);
		System.out.println(Übung3Auto.getProduktionzaehler());
		Übung3Auto Auto2 = new Übung3Auto("BMW", "Rot", 2000);
		System.out.println(Übung3Auto.getProduktionzaehler());
		Übung3Auto Auto3 = new Übung3Auto("Porsche", "Weiss", 3000);
		System.out.println(Übung3Auto.getProduktionzaehler());
		Übung3Auto Auto4 = new Übung3Auto("Kein", "Kein", -1);
		System.out.println(Übung3Auto.getProduktionzaehler());
	}
}
