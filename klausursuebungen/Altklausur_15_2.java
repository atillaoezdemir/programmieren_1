package klausursuebungen;

public class altKlausur_15_2 {
	
	public static int[] sortiereAbsteigend(int[] array) {
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array.length ; j++) {
				int temp;
				if(array[j] < array[i]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = { 3 , 7 , 1 , 2 , 8 };
		int[] folge = sortiereAbsteigend(array);
		
		for(int i = 0 ; i < folge.length; i++)
			System.out.println(folge[i]);
	}
}
