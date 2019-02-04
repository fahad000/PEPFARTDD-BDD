@login @reliable @pepfar 
@mecha-search@test-2 @pepfar 
Feature: Management & Operations 

	As a PEPFAR user, 
I want to search for the mechanism using the available search feature 
So that, I can narrow down my search results

Background: 
	Given that the 'HQ admin User' has logged into the PEPFAR application 
	Then the home navigation page should dispaly 
	
Scenario: Management & Operations page verification 
	Then click on Management & Operations sub tab 
	And system navigates to Management & Operations home page and the following sub tabs are displayed 
		|Staffing Search| | Agency Cost Of Doing Business|