Feature: feature to test login functionality
  Scenario: Check login successful with valid credentials
    Given user is in loginpage
    When user enters username and password
    And click on login button
    Then user should get navigate to the homepage


