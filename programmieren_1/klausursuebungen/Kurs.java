package klausursuebungen;

public class Kurs {

	private String kursArt;
	private int kursDauer;
	private Mitglied[] mitglieder;
	private int maxTeilnehmer;
	private int currentTeilnehmer = 0;

	public Kurs(String kursArt, int kursDauer, int maxTeilnehmer) {
		this.kursArt = kursArt;
		this.kursDauer = kursDauer;
		this.maxTeilnehmer = maxTeilnehmer;
		this.mitglieder = new Mitglied[maxTeilnehmer];
	}

	public void anmeldungKurs(Mitglied mitglied) {
		
		if (currentTeilnehmer == maxTeilnehmer)
			System.out.println("Kurs ist voll, Anmeldung nicht möglich.");
		
		for (int i = 0; i < currentTeilnehmer; i++) {
			if (mitglieder[i].getMitgliedsnummer() == mitglied.getMitgliedsnummer())
				System.out.println("Mitglied hat sich bereits für diesen Kurs angemeldet.");
		}
		
		mitglieder[currentTeilnehmer++] = mitglied;
		mitglied.setCurrentKurs(this);
	}

	public void abmeldungKurs(Mitglied mitglied) {
		
		for (int i = 0; i < currentTeilnehmer; i++) {
			if (mitglieder[i].getMitgliedsnummer() == mitglied.getMitgliedsnummer()) {
				for (int j = i; j < currentTeilnehmer - 1; j++)
					mitglieder[j] = mitglieder[j + 1];
			
				currentTeilnehmer--;
				mitglied.setCurrentKurs(null);
			}
		}
		System.out.println("Mitglied nicht in diesem Kurs gefunden.");
	}
}
