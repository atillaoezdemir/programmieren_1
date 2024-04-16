package Lektion9;

public class Übung3Raum {
	
	private String name;
	private int anzahl = (int) (Math.random() * 20);;
	private int teilnehmer;
	private int kapazitat = 20;

	public Übung3Raum(String name, int teilnehmer) {
			this.name = name;
			this.teilnehmer = teilnehmer;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTeilnehmer() {
		return teilnehmer;
	}

	public void setTeilnehmer(int teilnehmer) {
		this.teilnehmer = teilnehmer;
	}

	public void BelegungZustand() {
		if (teilnehmer <= 0) {
			System.out.println("Teilnehmer muss größer als 0!");
			this.teilnehmer = 0;
		}
		
		if (kapazitat - anzahl >= teilnehmer)
			System.out.println("Übung3Raum: " + this.getName() + " -> Belegt!");
		
		else
			System.out.println("Übung3Raum: " + this.getName() + " -> Unbelegt!");
	}
}
