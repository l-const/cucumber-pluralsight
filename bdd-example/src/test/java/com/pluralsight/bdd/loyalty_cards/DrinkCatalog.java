package com.pluralsight.bdd.loyalty_cards;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DrinkCatalog {

    private Map<String, String> drinkCategories = new HashMap<>();

    public void addDrink(DrinkData drinkData) {
        drinkCategories.put(drinkData.getName(), drinkData.getCategory());
    }

    String getCategoryOfDrink(String drink) {
        return drinkCategories.get(drink);
    }

}
