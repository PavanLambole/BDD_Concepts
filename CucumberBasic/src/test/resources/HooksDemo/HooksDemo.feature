Feature: Validate Functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When enter username and password
    And click on login button
    Then User logined
