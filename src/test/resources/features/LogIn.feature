Feature: Login funtionality

  Scenario Outline: Login with valid credentials
    Given User navigates to login page
    When User has entered valid email address <userName> into email field
    And User has entered valid password <password> into password field
    And click on login button
    Then User should get logged in successfully
    
    Examples:
		|userName								|password	|
		|amotooricap1@gmail.com	|12345		|
		|amotooricap2@gmail.com	|12345		|
		|amotooricap3@gmail.com	|12345		|
		

  Scenario: Login with invalid credentials
    Given User navigates to login page
    When User has entered invalid email address "amotooricap9233@gmail.com" into email field
    And User has entered invalid password "1234554433" into password field
    And click on login button
    Then User should get warning massage

  Scenario: Login with invalid email and valid password
    Given User navigates to login page
    When User has entered invalid email address "amotooricap9233@gmail.com" into email field
    And User has entered valid password "12345" into password field
    And click on login button
    Then User should get warning massage

  Scenario: Login with valid email and invalid password
    Given User navigates to login page
    When User has entered valid email address "amotooricap9@gmail.com" into email field
    And User has entered valid password "1234565432" into password field
    And click on login button
    Then User should get warning massage

  Scenario: Click on log in button without enterting any values
    Given User navigates to login page
    When click on login button
    Then User should get warning massage
