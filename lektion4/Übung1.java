package Lektion4;

public class Übung1 {
	public static void main(String[] args) throws InterruptedException {
	
		for(int a = 15; a > 0; a--) {
			System.out.println(a);
			Thread.sleep(1000);
		}
	}
}
