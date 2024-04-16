package Lektion10;

public class Übung3Auto {
	private String Marke;
	private String Farbe;
	private int Hubraum;
	private static int Produktionzaehler = 0;

	public Übung3Auto(String Marke, String Farbe, int Hubraum) {
		this.Marke = Marke;
		this.Farbe = Farbe;
		if (Hubraum > 0) {
			this.Hubraum = Hubraum;
		} else {
			this.Hubraum = 1600;
		}
		setProduktionzaehler(getProduktionzaehler() + 1);
	}

	public void setMarke(String Marke) {
		this.Marke = Marke;
	}

	public String getMarke() {
		return this.Marke;
	}

	public void setFarbe(String Farbe) {
		this.Farbe = Farbe;
	}

	public String getFarbe() {
		return this.Farbe;
	}

	public void setHubraum(int ccm) {
		if (ccm > 0) {
			this.Hubraum = ccm;
		} else {
			this.Hubraum = 1600;
		}
	}

	public int getHubraum() {
		return this.Hubraum;
	}

	public static int getProduktionzaehler() {
		return Produktionzaehler;
	}

	public static void setProduktionzaehler(int produktionzaehler) {
		Produktionzaehler = produktionzaehler;
	}
}
