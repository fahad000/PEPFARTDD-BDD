@login @reliable @pepfar 
Feature: Mechanisms 

As a FACTS Info user, 
I want to successfully log in to the PEPFAR Application 
So that, I can perform my job based on my permission

Background:
		Given that the 'HQ User' has logged into the PEPFAR application
		Then the home navigation page should dispaly 
		
		
@mecha-search@test-1 @pepfar
Scenario: Mechanisms page verification 
	Then click on Mechanisms sub tab 
	And system navigates to Mechanism home page and the following sub tabs are displayed 
		|Mechanism Dashboard| | Mechansim Search|