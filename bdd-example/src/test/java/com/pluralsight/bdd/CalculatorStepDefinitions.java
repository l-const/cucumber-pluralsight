package com.pluralsight.bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Random;

public class CalculatorStepDefinitions {

    public CalculatorStepDefinitions() {
        System.out.println("Constructor Called again , " + new Random());
    }

    @Given("I have a calculator")
    public void i_have_a_calculator() {

    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {

    }
    @Then("I should get {int}")
    public void i_should_get(Integer int1) {

    }
}
