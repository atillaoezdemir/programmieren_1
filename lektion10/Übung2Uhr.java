package Lektion10;

public class Übung2Uhr {
	int Stunden;
	int Minuten;
	int Sekunden;

	public Übung2Uhr(int Stunden, int Minuten, int Sekunden) {
		if (Stunden < 0 || Stunden > 24 || Minuten < 0 || Minuten > 60 || Sekunden > 60 || Sekunden < 0) {
			System.out.println("Ungültige parameter! Die Uhr 12:00:00 gesetzt werden");
			this.Minuten = 0;
			this.Stunden = 12;
			this.Sekunden = 0;
		} else {
			this.Minuten = Minuten;
			this.Stunden = Stunden;
			this.Sekunden = Sekunden;
		}
	}

	public int getStunden() {
		return Stunden;
	}

	public int getMinuten() {
		return Minuten;
	}

	public int getSekunden() {
		return Sekunden;
	}

	public void setUhr(int Stunden, int Minuten, int Sekunden) {
		if (Stunden <= 0 || Stunden > 24 || Minuten < 0 || Minuten > 60 || Sekunden > 60 || Sekunden < 0) {
			System.out.println("Ungültige parameter! Die Uhr nicht geaendert werden!");
		} else {
			this.Minuten = Minuten;
			this.Stunden = Stunden;
			this.Sekunden = Sekunden;
		}
	}

	public void naechsteSek() {
		if(this.Sekunden == 59) {
			this.Sekunden=0;
			this.Minuten++;
			if(this.Minuten == 59) {
				this.Minuten=0;
				this.Stunden++;
				if(this.Stunden == 23) {
					this.Stunden=0;
				}
			}
		}
		else this.Sekunden++;
	}
}
