Feature: Calculator

  Scenario: Add two numbers
    Given I have calculator
    When I add 2 and 2
    Then Result is 4