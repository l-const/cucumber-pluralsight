package com.pluralsight.bdd.loyalty_cards;

import java.util.HashMap;
import java.util.Map;

public class SuperSmoothieSchema {
    private Map<String, Integer> pointPerCategory = new HashMap<>();
    private DrinkCatalog catalog;

    public SuperSmoothieSchema(DrinkCatalog catalog) {
        this.catalog = catalog;
    }

    public void setPointsPerCategory(String category, Integer points) {
        pointPerCategory.put(category, points);
    }


    public int getPointsFor(String drink) {
        return pointPerCategory.get(categoryOf(drink));
    }


    private String categoryOf(String drink) {
        return catalog.getCategoryOfDrink(drink);
    }

}
