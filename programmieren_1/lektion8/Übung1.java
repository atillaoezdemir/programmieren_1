package Lektion8;

import java.util.Scanner;

public class Übung1 {
	
    public static void main(String[] args) {

        System.out.println("Galgenmaennchen!");
        String[] words = new String[]{"WERT", "SCHLEIFE", "HARDWARE", "SOFTWARE", "PYTHON", "HELLOWORLD", "COMPUTERSPRACHE", "PROGRAMMIEREN", "JAVA", "CODE", "IT", "ALGORITHMUS", "ANWEISUNG", "FLOAT", "INTEGER", "OPERAND", "OPERATOR", "QUELLCODE", "SKRIPT", "VARIABLE"};
        String randomWord = words[(int) (Math.random() * 20)];
        char[] letters = new char[randomWord.length()];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = '_';
            System.out.print("_ ");
        }

        System.out.print("\n");
        int chance = 15;

        Scanner scanner = new Scanner(System.in);

        while (chance > 0) {
            boolean isGameFinish = false;
            int isGameFinished = 0;

            for (int a = 0; a < letters.length; a++) {
                if (letters[a] != '_') {
                    isGameFinished++;
                    if (isGameFinished == letters.length) {
                        isGameFinish = true;
                    }
                }
            }

            if (isGameFinish) {
                System.out.println("Glueckwunsch!");
                System.out.println("Exiting Game");
                scanner.close();
                break;
            }

            System.out.println("Chance: " + chance);

            System.out.println("Input: ");

            String input = scanner.nextLine();
            input = input.toUpperCase();
            char letter = input.charAt(0);

            boolean isGuessCorrect = false;

            for (int i = 0; i < randomWord.length(); i++) {
                char l = randomWord.charAt(i);

                if (l == letter) {
                    letters[i] = l;
                    isGuessCorrect = true;
                }
            }

            if (!isGuessCorrect) {
                chance = chance - 1;
                if (chance == 0) {
                    System.out.println("Keine Chance!");
                    System.out.println("Exiting Game");
                    scanner.close();
                    break;
                }
            }

            System.out.print("Word: ");

            for (int i = 0; i < letters.length; i++)
                System.out.print(letters[i] + " ");

            System.out.println();
            System.out.println("****************");
        }
    }
}
 
