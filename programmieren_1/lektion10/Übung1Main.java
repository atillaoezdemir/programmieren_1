package Lektion10;

public class Übung1Main {
	public static void main(String[] args) {

		Übung1Student s1 = new Übung1Student("Alice", 12345);
		Übung1Student s2 = new Übung1Student("Bob", 67890);
		Übung1Student s3 = new Übung1Student("Charlie", 13);

		Übung1Student.betreteRaum(s1);
		Übung1Student.betreteRaum(s2);
		Übung1Student.betreteRaum(s3);
		Übung1Student.printStudenten();
//		Student.verlasseRaum(s3);
//		Student.printStudenten();
//		Student.verlasseRaum(s1);
//		Student.verlasseRaum(s2);
//		Student.printStudenten();
//		Student.verlasseRaum(s1);
	}
}