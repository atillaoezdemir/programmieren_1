package klausursuebungen;

public class Mitglied {
    private int mitgliedsnummer;
    private Kurs currentKurs;
    
    public Mitglied(int mitgliedsnummer) {
        this.mitgliedsnummer = mitgliedsnummer;
    }
    
    public void setCurrentKurs(Kurs currentKurs) {
        this.currentKurs = currentKurs;
    }
    public int getMitgliedsnummer() {
        return mitgliedsnummer;
    }
}