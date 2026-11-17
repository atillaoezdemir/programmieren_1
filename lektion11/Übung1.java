package Lektion11;

public class Übung1 {

	public static int[] zeilenMaxima(int[][] matrix) {
		int[] rückgabe = new int[matrix.length]; // matrixin satır sayısını veriyor

		for (int i = 0; i < matrix.length; i++) {
			int max = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
			rückgabe[i] = max;
		}
		return rückgabe;
	}

	public static void main(String args[]) {
		int[][] matrix = { { 3, 3, 0 , 4 },
						   { 6, 5, 2 }, 
						   { 8, 8, 1 },
						   { 8, 8 } };
		int[] maxValues = zeilenMaxima(matrix);
		System.out.println(matrix.length);
		System.out.println(matrix[3].length);
		for (int i = 0; i < maxValues.length; i++) {
			System.out.println(maxValues[i]);
		}
	}

}
