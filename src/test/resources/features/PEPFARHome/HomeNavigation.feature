@login @reliable @pepfar
Feature: Log in to the FACTS Info system 

As a FACTS Info user, 
I want to successfully log in to the PEPFAR Application 
So that, I can perform my job based on my permission

#Given that the user has logged into the application


#PBI-000
@version:Release1.0 
@test-1 @pepfar
Scenario: Log in with user role
		Given that the 'FRA User' has logged into the PEPFAR application
		Then the home navigation page should dispaly 
		When I view my 'Mechanisms' tab then 'Mecanisms Search' tab 
		

#        And the following tabs should displayed:
#	   	  	|Mechanisms|
##	   	  	|Management & Operations|
#	   	  	|Administration|
		
		   
     
	   	  	