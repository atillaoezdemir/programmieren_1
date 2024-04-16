package klausursuebungen;

public class Aufgabe3 { //Lektion 8 PasswordGenerator
	
	public static void main(String[] args) {
	
		String versuch = "Ich gehe morgen! !mit meinen 11 Freund*innen zum Essen !";
		char[] pass = new char[100];
		int passi = 0;
		boolean Zeichen = false;
		
		for (int i = 0; i < versuch.length(); i++) {
			if (versuch.charAt(0) != ' ' && passi == 0) {
				pass[0] = versuch.charAt(0);
				passi++;
			} else if (versuch.charAt(i) == ' ' && versuch.charAt(i + 1) != ' ') {
				pass[passi] = versuch.charAt(i + 1);
				passi++;
				i++;
			} else if (versuch.charAt(i) == '!' || versuch.charAt(i) == '?' || versuch.charAt(i) == ':'
					|| versuch.charAt(i) == '%') {
				pass[passi] = versuch.charAt(i);
				passi++;
				Zeichen = true;
			}
		}
		
		System.out.println(passi);
		
		if (15 < passi)
			System.out.println("So long!");
		
		if (10 > passi)
			System.out.println("So short!");
		
		if (!Zeichen)
			System.out.println("Mindestens einmal Zeichen!");
		
		for (int i = 0; i < pass.length; i++)
			System.out.print(pass[i]);
	}
}
