package de.thws.lektion1.uebung2;

public class Uebung2 {

    public static void main(String[] args) {
    
        System.out.println("x2 + px + q = 0");

        int p = 20;
        int q = 5;
        double x1 = (-p / 2) + Math.sqrt((p / 2.0) * (p / 2.0) - q);
        double x2 = (-p / 2) - Math.sqrt((p / 2.0) * (p / 2.0) - q);

        System.out.println("Wenn p ist " + p + " und q ist " + q);
        System.out.println("x1 ist: " + x1 + "\nx2 ist: " + x2);
    }
}
