package de.thws.lektion1.uebung3;

import java.time.LocalTime;

public class Uebung3 {
    
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println("Zeit: " + now);

        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

        double pastsecond = hour * 60 * 60 + minute * 60 + second;
        System.out.println("\nVergangenen Sekunden: " + pastsecond);
        double totalsecond = 24 * 60 * 60;
        System.out.println("Verbleibenden Sekunden: " + (totalsecond - pastsecond));
        System.out.println("Vergangene Zeit von heute: %" + (pastsecond / totalsecond * 100));
    }
}
