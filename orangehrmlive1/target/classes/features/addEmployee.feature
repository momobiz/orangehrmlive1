Feature: Test add employee functionality
	Background: User must be on the home page 
		Given User is on the login page
		When  User enters valid username as "Admin" and password as "admin123" and clicks on login button
		
	Scenario Outline: 
		Given User should be navigated to Home page 
		When  User clicks on add Employee
		And   User should be directed to formular page to add new employee
		And   User enters firstname as "<firstname>" and lastname as "<lastname>" of a new employee and click on save button
		Then  User should be navigated to profile 
		
		Examples: 
		|	firstname	|	lastname	|
		|	sonia		|	ben mahmoudia		|