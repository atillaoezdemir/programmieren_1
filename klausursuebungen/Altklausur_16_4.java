package klausursuebungen;

public class altKlausur_16_4 {
	
	public static void main(String[] args) {
		char[] facher = new char[99];
		
		for(int i = 0; i < facher.length; i++)
			facher[i] = 'z';
		
		int mod = 1;
		
		for(int i = 0; i < facher.length; i++, mod++) {
			if(facher[i] % mod == 0)
				if(facher[i] == 'o') 
					facher[i] = 'z';
				else 
					facher[i] = 'o';
		}
		
		for(int i = 0; i < facher.length; i++)
			System.out.print(facher[i]);
	}
}
