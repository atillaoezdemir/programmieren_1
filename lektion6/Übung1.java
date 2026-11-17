package Lektion6;

public class Übung1 {
	
	public static int powerOfTen(int power) {
		if (power == 1) return 10;
		else return 10 * powerOfTen(power - 1);
    	}
    
	public static void main(String[] args) {
        	double number = 3.6;
        	int exponent;

		// Convert decimal number to integer
        	for(exponent = 1 ; exponent < 16 ; exponent++) {
            	number = number * 10;
            	if (number % 1 == 0) 
			break;
        	}
        	
        	if(number % 10 < 5) {
         		number = number - (number % 10);
         		number = number / powerOfTen(exponent);
       	 	}	
            
        	else {
           		number = number + (10 - (number % 10));
           	 	number = number / powerOfTen(exponent);
        	}
		
        	System.out.println(number);
    	}
}
