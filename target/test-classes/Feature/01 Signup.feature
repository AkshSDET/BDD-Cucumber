Feature: Feature to test the Signup functionality

@Reg
  Scenario: Check signup is working or not
    Given user is on the Login page
    And user clicks on create profile page
    When user enter the registration details
    And user clicks on submit button
    Then user return to home page

