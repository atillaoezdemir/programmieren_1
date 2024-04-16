package Lektion9;

import java.util.ArrayList;

public class Übung2Pizza {
  
    private final String name;
    private final ArrayList<DiameterPrice> diameterPrices;

    public Pizza(String name) {
        this.name = name;
        this.diameterPrices = new ArrayList<>();
    }

    public void addDiameterPrice(double diameter, double price) {
        diameterPrices.add(new DiameterPrice(diameter, price));
    }

    public DiameterPrice getBestValue() {
        double bestValue = Double.MAX_VALUE;
        DiameterPrice bestCombination = null;

        for (DiameterPrice dp : diameterPrices) {
            double value = dp.getPrice() / dp.getDiameter();
            if (value < bestValue) {
                bestValue = value;
                bestCombination = dp;
            }
        }
        return bestCombination;
    }

    public String getName() {
        return name;
    }
}

class DiameterPrice {
    private final double diameter;
    private final double price;

    public DiameterPrice(double diameter, double price) {
        this.diameter = diameter;
        this.price = price;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getPrice() {
        return price;
    }
}





}
