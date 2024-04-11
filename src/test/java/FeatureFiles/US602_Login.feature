Feature: Login Functionality

  Background:
    Given Navigate to the Website Parabank


  @Smoke @Accounts @Regression
  Scenario: Login with valid username and password
    When Enter customer Data and click on the Register button
    Then Enter username and password and click on the login button
    And User should be successfully logged in

  @Smoke @Accounts @Regression
  Scenario: Login with invalid username and password

    When Enter invalid username and password and click on the login button
    Then User should receive an error message




