package klausursuebungen;

import java.util.Scanner;

public class Aufgabe5 {

	private static char[] pass = new char[100];
	private static String createdForm;
	private static int nrOfSpecialChars;
	private static int nrOfDigits;
	private static int nrOfChar;

	public static void addCharToPassword(char c, boolean isSpecialChar, boolean isDigit) {
		pass[nrOfChar] = c;
		if (isSpecialChar)
			nrOfSpecialChars++;
		if (isDigit)
			nrOfDigits++;
	}

	public static boolean validate() {
		int length = nrOfChar;
		if (length < 8 || length > 15)
			return false;
	
		if (nrOfSpecialChars == 0 || nrOfDigits == 0)
			return false;
		
		return true;
	}

	public static void main(String[] args) {
		
		createdForm = "Ich gehe morgen! mit meinen 11  Freund*innen zum Essen ! 1";
		nrOfChar = 0;
		boolean specialChar = false;
		
		for (int i = 0; i < createdForm.length(); i++) {
		
			if (createdForm.charAt(0) != ' ' && nrOfChar == 0) {
				pass[0] = createdForm.charAt(0);
				nrOfChar++;
				
			} else if (createdForm.charAt(i) == '!' || createdForm.charAt(i) == '?' || createdForm.charAt(i) == ':'
					|| createdForm.charAt(i) == '%') {
				pass[nrOfChar] = createdForm.charAt(i);
				nrOfChar++;
				nrOfSpecialChars++;
				i++;

			} else if (createdForm.charAt(i) == ' ' && createdForm.charAt(i + 1) != ' ') {
				pass[nrOfChar] = createdForm.charAt(i + 1);
				nrOfChar++;

				if (createdForm.charAt(i + 1) == '!' || createdForm.charAt(i + 1) == '?'
						|| createdForm.charAt(i + 1) == ':' || createdForm.charAt(i + 1) == '%') {
					nrOfSpecialChars++;
					i++;
				}
			}
		}
		
		System.out.print("Password:\t\t");
		for (int i = 0; i < pass.length; i++)
			System.out.print(pass[i]);
			
		System.out.println("\nCreatedFrom:\t\t" + createdForm);
		
		for (int i = 0; i < nrOfChar; i++) {
			if (pass[i] >= '0' && pass[i] <= '9')
				nrOfDigits++;
		}

		System.out.println("NrOfSpecialChars:\t" + nrOfSpecialChars);
		System.out.println("NrOfDigits:\t\t" + nrOfDigits);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Add new char to password: ");
		char c = scanner.nextLine().charAt(0);
		scanner.close();

		boolean isSpecialChar = false;
		if (c == '!' || c == '?' || c == ':' || c == '%')
			isSpecialChar = true;
		boolean isDigit = false;
		if (c >= '0' && c <= '9')
			isDigit = true;

		addCharToPassword(c, isSpecialChar, isDigit);
		System.out.print("Your new password:  \t");
		
		for (int i = 0; i < pass.length; i++)
			System.out.print(pass[i]);
		
		System.out.println("\nIs your password valid? " + validate());
	}
}
