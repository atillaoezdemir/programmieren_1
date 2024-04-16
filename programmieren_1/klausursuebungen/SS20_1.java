package klausursuebungen;

public class ss20_1 {

	public static double lnx(double x) {
		double folge = 1;
		double summefolge = 0;
		double b = x - 1;
		double bhochn = 1;
		double y;
	
		for(double n = 1 ; folge > 1E-16 ; n++) {
			y = n;
			
			while(y != 0) {
				bhochn = bhochn * b;
				y--;
			}
			
			if(n % 2 == 0)
				folge = (-1 / n) * bhochn;
			
			else 
				folge = (1 / n) * bhochn;
		
			summefolge += folge;
		}
		return summefolge;
	}
	
	public static void main(String args[]) {
		System.out.println(lnx(0) + " < ln(x) < " + lnx(2));
	}
}
