Feature: Register functionality

  @Smoke @Accounts @Regression
    Scenario: Register with Customer Data

    Given Navigate to the Website Parabank
    When Enter customer Data and click on the Register button
    Then User should be successfully registered
