package klausursuebungen;

public class ss20_2 {
	
	public static int[] flatten(int[][] input) {
		int zahlAnzahl = 0;
		int outputNummer = 0;
	
		for(int i = 0; i < input.length; i++)
			zahlAnzahl += input[i].length;
	
		int output[] = new int[zahlAnzahl];
			
		int j;
		
		for(int i = 0; i < input.length; i++) {
			j = 0;
			for(; j < input[i].length; j++) {
				output[outputNummer] = input[i][j];
				outputNummer++;
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		int[][] matrix = { { 3, 3, 0 , 4 },
				   { 6, 5, 2 }, 
				   { 8, 8, 1 },
				   { 8, 8 } };
		
		int[] flattenedArray = flatten(matrix);
		
		for (int i = 0; i < flattenedArray.length; i++)
		    System.out.print(flattenedArray[i] + " ");
	}
}

