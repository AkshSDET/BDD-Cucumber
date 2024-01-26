Feature: Feature to test the login functionality

@Reg
  Scenario: Check login is succesfull with valid credenetials
    Given user is on the home page
    When user enters the username and password
    And click on submit
    Then user is navigate to the Dashboard
