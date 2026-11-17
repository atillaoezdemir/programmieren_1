package Lektion5;

public class Übung1 {
	public static void main(String[] args) {
		
		double x=1.0;
		int i = 1;
		double summe = 0;
		
		while(i>0) {
			double folge = 1.0/(x * x);
			summe = summe + folge;
			System.out.println("a(" + i +") = " + (6 * summe));
			
			if(folge < 10E-5) 
				break;
			
			x++;
			i++;
		}
	}
}
