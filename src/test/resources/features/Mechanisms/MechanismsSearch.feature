 @reliable 
Feature: Mechanism search 

As a PEPFAR user, 
I want to search for the mechanism using the available search feature 
So that, I can narrow down my search results

Background:
		Given that the 'HQ User' has logged into the PEPFAR application
		Then the home navigation page should dispaly 

#PBI-000
@version:Release1.0 
@test-1
Scenario: Verify available Mechanism search fields
		When I view my 'Mechanisms' tab then 'Mecanisms Search' tab 
		Then the following fields should be enabled 
		When I click on the search icon 
		Then the resutls '1 - 5 of 470' display in the resutls grid 
		When I search with the Mechanisms ID '9108' 
		Then the resutls '1 - 1 of 1' display in the resutls grid 
		
		
#PBI-000
@version:Release1.0 
@test-2 
Scenario: Verify OU dropdown list
		When I view my 'Mechanisms' tab then 'Mecanisms Search' tab 
		And I view the OU drop down field  
		Then the following OUs should be available:
			|Angola|Asia Regional Program|Botswana|Burma|Caribbean Region|
			|Burundi|Cambodia|Cameroon|Zambia|India|
			|Caribbean Region|Central America Region|China|Mozambique|Democratic Republic of the Congo|
			|Dominican Republic|Eswatini|Ethiopia|Ghana|Guyana|
			|Haiti|Indonesia|Kenya|Lesotho|Malawi|
			|Namibia|Nigeria|Papua New Guinea|Russia|South Sudan|
			|Tanzania|Thailand|Uganda|Ukraine|Vietnam|
#			||Zimbabwe|
		
		When I type ahead 'DO' in to Funding Agency field 
		Then the following agency should be available:
			|  DOL (U.S. Department of Labor) |
			|  DOL (U.S. Department of Labor) |  		
		
		 
		