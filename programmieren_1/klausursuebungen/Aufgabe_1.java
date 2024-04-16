package klausursuebungen;

public class Aufgabe1 {
	
	public static char[] ersetze(String a) {
		char[] name = a.toCharArray();
		int punkt = 0;
		for(int i = name.length-1; i > 0 ; i--) {
			if (name[i] == '.') {
				punkt++;
				if(punkt > 1)
					name[i] = '_';
			}
		}
		return name;
	}
	
	public static void main(String[] args) {
		String a = "Graphik.Init.Datei.ini";
		System.out.println(ersetze(a));
	}
}
