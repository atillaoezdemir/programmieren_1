package Lektion6;

public class Übung6 {
	
	public static int jumpInMultipleJumps(int distance, int jump1, int jump2) {
		
        	if (distance < 0)
            		return 0;
        
        	if (distance == 0)
			eturn 1;
        
        	int ways = 0;
        	ways += jumpInMultipleJumps(distance - jump1, jump1, jump2);
        	ways += jumpInMultipleJumps(distance - jump2, jump1, jump2);
		
        	return ways;
    	}
	
	public static void main(String[] args) {
		System.out.println(jumpInMultipleJumps(5 , 2 , 3));
	}
}
