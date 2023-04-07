Feature: Register functionality

Scenario: Register with mandatoty fields

Given User has navigate to register page
When User enter below details into feilds
|FirstName 				|arun|
|LastName 				| motoori|
|Email 						|arun.motoori@gmail.com|
|phoneNumber			|123456|
|password					|123456|
|confirmPassword	|123456|
And Select privacy policy
And Click on continue button
Then User account should get create 

Scenario: Register with all mandatoty fields

Given User has navigate to register page
When User enter below details into feilds
|FirstName 				|arun|
|LastName 				| motoori|
|Email 						|arun.motoori@gmail.com|
|phoneNumber			|123456|
|password					|123456|
|confirmPassword	|123456|
And Select news later yes
And Select privacy policy
And Click on continue button
Then User account should get create 

Scenario: Register with existing email

Given User has navigate to register page
When User enter below registered details into feilds
|FirstName 				|arun|
|LastName 				| motoori|
|Email 						|amotoori9@gmail.com|
|phoneNumber			|123456|
|password					|123456|
|confirmPassword	|123456|
And Select news later yes
And Select privacy policy
And Click on continue button
Then User should get warning message 

Scenario: User click on continue button without entering details
Given User has navigate to register page
When Click on continue button
Then User should get all madatory feilds warning message 
