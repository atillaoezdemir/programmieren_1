package Lektion8;

public class Übung5 {

	public static void main(String[] args) {
		
		Übung5Auto Auto1 = new Übung5Auto();
		Auto1.Marke = "Mercedes";
		Auto1.Hubraum = "5461 cm^3";
		Auto1.Farbe = "Schwarz";
		Auto1.Segment = "SUV";
		
		Übung5Auto Auto2 = new Übung5Auto();
		Auto2.Marke = "Tesla";
		Auto2.Hubraum = "3461 cm^3";
		Auto2.Farbe = "Silver";
		Auto2.Segment = "Electric-SUV";
		
		Übung5Auto Auto3 = new Übung5Auto();
		Auto3.Marke = "Audi";
		Auto3.Hubraum = "4000 cm^3";
		Auto3.Farbe = "Schwarz";
		Auto3.Segment = "Hatchback";
		
		System.out.println(Auto1.Marke + "\n" + Auto1.Hubraum + "\n" + Auto1.Farbe + "\n" + Auto1.Segment);
		System.out.println("------------------------");
		System.out.println(Auto1.Marke + "\n" + Auto2.Hubraum + "\n" + Auto2.Farbe + "\n" + Auto2.Segment);
		System.out.println("------------------------");
		System.out.println(Auto1.Marke + "\n" + Auto3.Hubraum + "\n" + Auto3.Farbe + "\n" + Auto3.Segment);
	}
}
