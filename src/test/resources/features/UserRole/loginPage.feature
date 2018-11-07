@login @reliable 
Feature: Log in to the FACTS Info system 

As a FACTS Info user, 
I want to successfully lon in to the Application 
So that, I can perform my job based on my permission

#Given that the user has logged into the application


#PBI-000
@version:Release1.0 
@scenario:test-1 
Scenario Outline: Log in with user role
		Given that the <user> has logged into the facts info application  
        Then the facts info dashboard should display      
		Examples:
		| user       | 
		| FRA USER   |
		| F USER|
		| BRM USER|
		| Budget Bureau|
		| OU Admin|
		| BP User|
		| OU User|
 	
