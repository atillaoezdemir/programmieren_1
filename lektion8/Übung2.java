package Lektion8;

public class Übung2 {
	
	public static void main(String[] args) {
		
		if(args.length == 2) 
			System.out.println(Double.valueOf(args[0]) * Double.valueOf(args[0]) );
		else 
			System.out.println("Bitte geben Sie 2 Variable ein!");
	}
}
