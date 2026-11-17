package klausursuebungen;

public class altKlausur_15_4 {

	public class Bruch{
		int zahler;
		int nenner;
		
		public Bruch(int zahler, int nenner) {
			this.zahler = zahler;
			this.nenner = nenner;
		}
		
		public static Bruch multizipliereBrueche(Bruch ein, Bruch zwei) {
			Bruch folge = null;
			folge.zahler = ein.zahler * zwei.zahler;
			folge.nenner = ein.nenner * zwei.nenner;
			return folge;
		}
	}
}
