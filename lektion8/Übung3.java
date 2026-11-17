package Lektion8;

public class Übung3 {

	public static void main(String[] args) {
		
		double folge = 0;
	
		for(int i = 0 ; i < args.length; i++) {
			if(args[(args.length) - 1] == "+")
				folge = folge + Double.valueOf(args[i]); 
		
			else if((args[args.length - 1]) == "-")
				folge = folge - Double.valueOf(args[i]); 
			}
		
		System.out.println(folge);
	}
}
