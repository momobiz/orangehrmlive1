Feature: Test login functionality
	
	Background: User open the login page
		Given User is on the login page
	
	Scenario Outline: Test login with valid credentials 
	
		When  User enters valid username as "<username>" and password as "<password>" and clicks on login button
		Then  User should be navigated to Home page 
	
		Examples: 
		|	username	|	password	|
		|	Admin		|	admin123	|
	
	Scenario Outline: Test login functionality with invalid credentials
	
		When From excel sheet user enters invalid credentials <usernameRowNumber> <usernameColumnNumber> and <passwordRowNumber> <passwordColumnNumber>
		Then User should be stay on the same page and see an error message  
		
		Examples:
		|	usernameRowNumber	|	usernameColumnNumber	| passwordRowNumber	|	passwordColumnNumber	|
		|	0					|	0						|	0				|	1						|
		|	1					|	0						|	1				|	1						|
			
		