package Lektion9;

public class Übung1Main {

	public static void main(String[] args) {
		Übung1Auto Auto1 = new Übung1Auto("Mercedes" , "Schwarz" , 1000);
		Übung1Auto Auto2 = new Übung1Auto("BMW" , "Rot" , 2000);
		Übung1Auto Auto3 = new Übung1Auto("Porsche" , "Weiss" , 3000);
		Übung1Auto Auto4 = new Übung1Auto("Kein" , "Kein" , -1);
	
		System.out.println(Auto1.getMarke() + "\t" + Auto1.getFarbe() + "\t" + Auto1.getHubraum());
		System.out.println(Auto2.getMarke() + "\t\t" + Auto2.getFarbe() + "\t" + Auto2.getHubraum());
		System.out.println(Auto3.getMarke() + "\t\t" + Auto3.getFarbe() + "\t" + Auto3.getHubraum());
		System.out.println(Auto4.getMarke() + "\t\t" + Auto4.getFarbe() + "\t" + Auto4.getHubraum());
	}
}
