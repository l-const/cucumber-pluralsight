package com.pluralsight.bdd.loyalty_cards;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;
import java.util.List;

public class SmoothieStepDefinitions {

    private List<DrinkData> drinks;


    @DataTableType
    public DrinkData drinkDataEntryTransformer(Map<String, String> row) {
        return new DrinkData(
                row.get("Drink"),
                row.get("Category"),
                Integer.parseInt(row.get("Points"))
        );
    }

    @Given("the following drink categories:")
    public void the_following_drink_categories(List<DrinkData> drinkData) {
        this.drinks = drinkData;
        System.out.println("Drinks: " + drinkData);
    }


    @Given("^(.*) is a Morning Freshness Member$")
    public void michael_is_a_morning_freshness_member(String name) {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("^(.*) purchases (\\d+) (.*) drinks$")
    public void michael_purchases_banana_drinks(String name, Integer int1, String drink) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println(name + " " + int1 + " " + drink );
    }
    @Then("^he should earn (\\d+) points$")
    public void he_should_earn_points(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
