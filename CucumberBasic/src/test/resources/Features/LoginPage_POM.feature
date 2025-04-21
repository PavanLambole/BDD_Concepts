@SmokeFeature=
Feature: feature to test login functionality
  

  
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enter <username> and <password>
    And user clicked on login button
    Then user navigate on home screen
    And close the browser

    Examples: 
      | username | password |
      | Admin    | admin123 |
