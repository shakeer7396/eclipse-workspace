Feature: Login

Scenario: Successful Login with Valid Credentials
		Given User Launch Chrome browser
		When User opens URL "https://admin-demo.nopcommerce.com/login"
		And User enters Email as "admin@yourstore.com" and Password as "admin"
		And Click on Login
		Then Page Title should be "Dashboard / nopCommerce administration"
		When User click on Log out link
		Then Page Title should be "Your store. Login"
		And close browser
		
		# checking for different email password so using data driven testing.
Scenario Outline: Successful Login with Valid Credentials DDT  
		Given User Launch Chrome browser
		When User opens URL "https://admin-demo.nopcommerce.com/login"
		And User enters Email as "<email>" and Password as "<password>" 
		And Click on Login
		Then Page Title should be "Dashboard / nopCommerce administration"
		When User click on Log out link
		Then Page Title should be "Your store. Login"
		And close browser
		
		Examples: #Input sets for Scenario Outline
		|email|password| #Syntex for impentation 
		|admin@yourstore.com|admin|
		|test@yourstore.com|admin|