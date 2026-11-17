package Lektion10;

public class Übung2Main {
	public static void main(String[] args) {
		Übung2Uhr[] uhrs = new Übung2Uhr[24];
		for (int i = 0; i < 24; i++) {
			uhrs[i] = new Übung2Uhr(i, 23, 07);
		}
		for (int i = 0; i < uhrs.length; i++) {
			uhrs[i].Sekunden++;
			System.out.printf("%02d:%02d:%02d", uhrs[i].Stunden, uhrs[i].Minuten , uhrs[i].Sekunden);
			System.out.println("\n");
		}

	}
}
