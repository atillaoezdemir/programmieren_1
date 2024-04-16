package Lektion3;

import java.util.Scanner;

public class BooleanAndLogisch {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Bitte geben Sie Ihr Alter ein: ");
	int alter = scanner.nextInt();
	System.out.print("Bitte geben Sie Ihre Größe ein; ");
	int groesse = scanner.nextInt();
	
	boolean alterNichtOk = alter > 26 || alter < 17;
	
	if(alterNichtOk && groesse < 165) 
		System.out.println("Eine Einstellung ist sehr unwahrscheinlich.");
	else if (alterNichtOk)
		System.out.println("Eine Einstellung ist unwahrscheinlich.");
	else if (groesse < 165)
		System.out.println("Eine Einstellung ist unwahrscheinlich.");
	else
		System.out.println("Eine Einstellung ist möglich.");
	
	scanner.close();
	}
}
