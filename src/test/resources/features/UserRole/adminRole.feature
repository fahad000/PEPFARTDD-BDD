@userRole @reliable @dry2
Feature: Admin role in budget  

As an admin user, for Budget Formulation Application,
I want to perform my job based of my role and permission

Background:
		 Given that the OU Admin has logged into the facts info application 
		 And my role is "OU Admin"
		 And my primary OU is "Angola" and my Bureau is "Africa"
		 And I have edit access to CBJ module 
		 

#PBI-000
@version:Release1.0
@scenario:test-1 
Scenario: Log in with user role		
		When I view my Budget Formulation tile  
		Then the Budget Formulation home page should display 
		And my primary OU should be "Angola" and my Bureau should be "Africa"
		
		
#PBI-000 @git 
@version:Release1.0
@scenario:test-1 
Scenario: Edit permission 
		When I select Budget area as "Congressional Budget Justification"
		And I view my Budget tab 
		And Select ESDF - OCO from account dropdown list   
		And I click on the other tab
		Then I should be able to enter values in the budget grid and save 