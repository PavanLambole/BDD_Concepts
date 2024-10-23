@SmokeFeature=
Feature: feature to test login functionality

  #	@smoketest
  #	Scenario: Check login is successful with valid credentials
  #  Given user is on login page
  #  When user enter userName and password
  # And user clicked on login button
  #  Then user navigate on home screen
  
  
  # Paramiterization and Data Driven Testing - for that Variable declare in Conical Bracket '<Variable>'  and
  # 'Scenario'  Convert to 'Scenario Outline'  ..we can use Data Table into a feature file
  
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enter <UserName> and <Password>
    And user clicked on login button
    Then user navigate on home screen
    And close the browser

    Examples: 
      | UserName | Password |
      | Admin    | admin123 |
