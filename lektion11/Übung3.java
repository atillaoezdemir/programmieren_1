package Lektion11;

public class Übung3 {
	public static int betrag(int nummer) {
		return (nummer < 0) ? - nummer : nummer;
	}
	public static float betrag(float nummer) {
		return (nummer < 0) ? - nummer : nummer;
	}
	public static double betrag(double nummer) {
		return (nummer < 0) ? - nummer : nummer;
	}
	public static short betrag(short nummer) {
		return (short) ((nummer < 0) ? - nummer : nummer);
	}
	public static long betrag(long nummer) {
		return (nummer < 0) ? - nummer : nummer;
	}
	public static void main(String[] args) {
		int intNummer = -10;
	    float floatNummer = -3.14f;
	    double doubleNummer = -1.414;
	    short shortNummer = -5;
	    long longNummer = -1234567890L;

	    System.out.println("int Nummer: " + betrag(intNummer));
	    System.out.println("float Nummer: " + betrag(floatNummer));
	    System.out.println("double Nummer: " + betrag(doubleNummer));
	    System.out.println("short Nummer: " + betrag(shortNummer));
	    System.out.println("long Nummer: " + betrag(longNummer));

	}

}
