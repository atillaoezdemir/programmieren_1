package klausursuebungen;

public class altKlausur_16 {
		
	public static boolean istISBNgültig(String zahl) {
		char[] zahlarray = zahl.toCharArray();
		boolean folge = false;
		int folgee = 0;
		
		for(int i = 1; i < 11; i++) {
			if(i == 1) 
				folgee += (zahl.charAt(i - 1) - '0') * i;
			else if(i >= 5 && i != 10) 
				folgee += (zahl.charAt(i + 1) - '0') * i;
			else if(i == 10) 
				folgee += (zahl.charAt(i + 2) - '0') * i;
			else 
				folgee += (zahl.charAt(i) - '0') * i;
		}
		
		if(folgee % 11 == 0)
			folge = true;
	
		return folge;
	}
	
	public static void main(String[] args) {
		String zahl = "3-528-05912-5";
		System.out.println(istISBNgültig(zahl));
	}
}
