package com.pluralsight.bdd.loyalty_cards;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SmoothieStepDefinitions {

    private List<DrinkData> drinks;

    private DrinkCatalog drinkCatalog = new DrinkCatalog();

    private SuperSmoothieSchema superSmoothieSchema = new SuperSmoothieSchema(drinkCatalog);

    private MorningFreshnessMember michael =  new MorningFreshnessMember("michael", superSmoothieSchema);


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
        drinkData.forEach(drink -> {
            drinkCatalog.addDrink(drink);
            superSmoothieSchema.setPointsPerCategory(drink.getCategory(), drink.getPoints());
        });
    }


    @Given("^(.*) is a Morning Freshness Member$")
    public void michael_is_a_morning_freshness_member(String name) {
        // Write code here that turns the phrase above into concrete actions
        michael = new MorningFreshnessMember(name, superSmoothieSchema);
    }
    @When("^(.*) purchases (\\d+) (.*) drinks$")
    public void michael_purchases_banana_drinks(String name, Integer amount, String drink) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        michael.orders(amount, drink);
        System.out.println(name + " " + amount + " " + drink);
    }
    @Then("^he should earn (\\d+) points$")
    public void he_should_earn_points(Integer expectedPoints) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        assertThat(michael.getPoints()).isEqualTo(expectedPoints);
    }
}
