Feature: Paying Bills functionalty

  Background:
    Given Navigate to the Website Parabank
    When Enter customer Data and click on the Register button
    Then Enter username and password and click on the login button
    When Click on the BillPay button


    Scenario: Electric Bill Payment
      Then Fill the payee Electric information
      And Click on The sendPayment button

      Scenario: Water Bill Payment

        When Fill the payee Water information
        And Click on The sendPayment button

        Scenario: Natural Gas Invoice Bill Payment
          When Fill the payee Gas Invoice information
          And Click on The sendPayment button


