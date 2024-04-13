Feature: New Account Functionality

  Background:
    Given Navigate to the Website Parabank
    When Enter customer Data and click on the Register button
    Then Enter username and password and click on the login button
    And Click on the Element in Open new Account LeftNav


    Scenario: Create new Checking Account
      And Create a new checking account


  Scenario: Create new Savings Account
    And  Create a new savings account
