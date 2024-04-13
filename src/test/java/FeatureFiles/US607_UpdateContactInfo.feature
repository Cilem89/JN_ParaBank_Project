Feature: Login Functionality

  Background:
    Given Navigate to the Website Parabank
    When Enter customer Data and click on the Register button
    Then Enter username and password and click on the login button

    Scenario: Update Contact Info
      #When Enter username and password and click on the login button for update test
      Given Navigate to Update Contact Info section
      When Customer change any information
      Then Information will change successfully
      And Customer log out
      Then Enter username and password and click on the login button
      Given Navigate to Update Contact Info section
      #Then Enter username and password and click on the login button for update test
      And Information changed'll be verified
