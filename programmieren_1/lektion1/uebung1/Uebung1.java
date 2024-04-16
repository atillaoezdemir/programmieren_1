package de.thws.lektion1.uebung1;

public class Uebung1 {
    
    public static void main(String[] args) {
    
        int a = 3;
        System.out.println("Wenn r=3 ist:");
        double kreisflaeche = (Math.PI * (a * a));
        System.out.println("\nKreisfläche: " + kreisflaeche);

        double kreisumfang = 2 * Math.PI * a;
        System.out.println("Kreisumfang: " + kreisumfang);

        double kugelvolumen = (4 / 3f) * Math.PI * (a * a * a);
        System.out.println("Kugelvolumen: " + kugelvolumen);
    }
}
