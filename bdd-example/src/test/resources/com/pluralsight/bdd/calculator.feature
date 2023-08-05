Feature: Calculator


  Scenario: Adding two numbers
    Given I have a calculator
    When I add 1 and 2
    Then I should get 3


  Scenario: Adding two numbers 2nd
    Given I have a calculator
    When I add 2 and 3
    Then I should get 5