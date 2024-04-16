package uebungen;

public class Student {
	
	String Name;
	int MatrikelNummer;
	private static int kapazität = 3;

	public Student(String Name, int MatrikelNummer) {
		this.Name = Name;
		this.MatrikelNummer = MatrikelNummer;
	}

	private static Student studenten[] = new Student[kapazität];
	private static int anzahlStudenten = 0;
	

	public static void betreteRaum(Student student) {
		if (anzahlStudenten < kapazität) {
			studenten[anzahlStudenten] = student;
			anzahlStudenten++;
		} else 
			System.out.println("Raum ist voll, kann keine weiteren Studenten hinzufügen");
	}

	public static void verlasseRaum(Student student) {
		boolean imRaum = false;
		int index = 0;
		
		for (int i = 0; i < anzahlStudenten; i++) {
			if (studenten[i].equals(student)) {
				imRaum = true;
				index = i;
				break;
			}
		}

		if (imRaum) {
			for (int i = index; i < anzahlStudenten - 1; i++)
				studenten[i] = studenten[i + 1];
				
			studenten[anzahlStudenten - 1] = null;
			anzahlStudenten--;
		} else 
			System.out.println("Student ist nicht im Raum");
	}

	public static void printStudenten() {
		if (anzahlStudenten == 0)
			System.out.println("Keine Studenten im Raum");
		else {
			for (int i = 0; i < anzahlStudenten; i++) {
				System.out.println(
						"Name: " + studenten[i].getName() + ", Matrikelnummer: " + studenten[i].getMatrikelNummer());
			}
			System.out.println("-----------------------------------------");
		}
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMatrikelNummer() {
		return MatrikelNummer;
	}

	public void setMatrikelNummer(int matrikelNummer) {
		MatrikelNummer = matrikelNummer;
	}
}
