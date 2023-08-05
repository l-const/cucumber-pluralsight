package com.pluralsight.bdd.loyalty_cards;

public class DrinkData {
    private final String name;
    private final  String category;

    private final int points;

    public DrinkData(String name, String category, Integer points) {
        this.name = name;
        this.category = category;
        this.points = points;
    }

    @Override
    public String toString() {
        return "DrinkData{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", points=" + points +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPoints() {
        return points;
    }
}
