package Lektion11;

public class Übung2 {

	public static void initArray2(int[] lottozahlen) {
		int[] zahlen = new int[6];
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = (int) (Math.random() * 49 + 1);
		}
		lottozahlen = zahlen;
	}

	public static void main(String[] args) {
		int[] lottozahlen = new int[6];
		initArray2(lottozahlen);
		for (int i = 0; i < lottozahlen.length; i++) {
			System.out.print(lottozahlen[i] + " ");
		}
		int[] a = {1 , 2 , 3};
		int[] b = new int[3];
		b = a;
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
