@userRole @reliable
Feature: User Role and permission  

As a FACTS Info Budget formulation user, 
I want to perform my job based of my role and permission

Background:
		 Given that the OU Admin has logged into the facts info application 
		 And my role is "OU Admin"
		 And my primary OU is "Angola" and my Bureau is "Africa"
		 

#PBI-000
@version:Release1.0
@scenario:test-1 @dry
Scenario: Log in with user role		
		When I view my Budget Formulation tile 
		Then the Budget Formulation home page should display
		And my primary OU should be "Angola" and my Bureau should be "Africa"
		
		
#PBI-000
@version:Release1.0
@scenario:test-1 @dry
Scenario: Edit permission 
		When I select Budget area as "Congressional Budget Justification"
		And I view my Budget tab 
		And Select a value from account dropdown list 
		And I click on the other tab
		Then I should be able to enter values in the budget grid and save
		