package Lektion4;

import java.lang.Math;

public class Übung4 {
	public static void main(String[] args) {
		
		float fahrenheit = 0;		
		System.out.println("Fahrenheit\tCelcius");

		while(fahrenheit < 301) {
			float celcius = (float)5/9 * (fahrenheit - 32f);
			System.out.println(fahrenheit + "\t \t" + Math.round(celcius));
			fahrenheit++;
		}
	}
}

//Method with -String.format("%.2f", celcius)- is also possible
