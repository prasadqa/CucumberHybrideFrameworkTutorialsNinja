Feature: Search functionality

Scenario: Search with valid product

Given User open the application
When User enter "Hp" valid product
And Click on search button
Then User should get valid product results

Scenario: Search with invalid product

Given User open the application
When User enter "Honda" valid product
And Click on search button
Then User should get message no product matching

Scenario: Search as without any product

Given User open the application
When User enter dont enter anything
And Click on search button
Then User should get warring message 

