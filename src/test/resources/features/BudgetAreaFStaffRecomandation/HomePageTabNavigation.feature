@home-tab @reliable
Feature: Home page Menus and Tabs verifiaction for all budget area 
Background:
        Given that the 'FRA User' has logged into the facts info application
        And I view my 'Budget Formulation' tile 
#PBI-19535, 19537
@version:Release1.0
@scenario:test-2 
Scenario: Verify FY20 CBJ Other accoonts tab displayd for based on bureau selection 
		When I select 'Congressional Budget Justification' from Budget Area
		Then the following top level dropdown menu should display:
   	  	|Fiscal Year|Budget Area|Bureau|Operating Unit| 		
		And the following tabs should display:
	   	|Home|Budget|Attributions|Mission Objectives|ESDF|Bureau Overview|Other Accounts|	   	  

#PBI-000
@version:Release4.0
@scenario:test-2 
Scenario: Verify FY20 'Mission Resource Request' tabs displayd for based on bureau selection 
		When I select 'Mission Resource Request' from Budget Area
		Then the following top level dropdown menu should display:
   	  	|Fiscal Year|Budget Area|Bureau|Operating Unit| 		
		And the following tabs should display:
	   	|Home|Budget|Attributions|Mission Objectives|Over Target Request|Mission Objective Validation|Narrative|
	   	
#PBI-000
@version:Release4.0
@scenario:test-2 
Scenario: Verify FY20 'Bureau Resource Request' tabs displayd for based on bureau selection 
		When I select 'Bureau Resource Request' from Budget Area
		Then the following top level dropdown menu should display:
   	  	|Fiscal Year|Budget Area|Bureau|		
		And the following tabs should display:
	   	|Home|Budget|Over Target Request|Attributions|Narrative|	   	
	   	
#PBI-000
@version:Release4.0
@scenario:test-2 
Scenario: Verify FY20 'Roundtables' tabs displayd for based on bureau selection 
		When I select 'Roundtables' from Budget Area
		Then the following top level dropdown menu should display:
   	  	|Fiscal Year|Budget Area|Account| 		
		And the following tabs should display:
	   	|Home|Budget|Over Target Request|Narrative|	   		   	  
#PBI-000
@version:Release4.0
@scenario:test-2 
Scenario: Verify FY20 'USAID Development Budget' tabs displayd for based on bureau selection 
		When I select 'USAID Development Budget' from Budget Area
		Then the following top level dropdown menu should display:
   	  	|Fiscal Year|Budget Area|Bureau|Operating Unit| 		
		And the following tabs should display:
	   	|Home|Budget|Attributions|	
#PBI-000
@version:Release4.0
@scenario:test-2 
Scenario: Verify FY20 'F Staff Recommendation' tabs displayd for based on bureau selection 
		When I select 'F Staff Recommendation' from Budget Area
		Then the following top level dropdown menu should display:
   	  	|Fiscal Year|Budget Area|Bureau|Operating Unit| 		
		And the following tabs should display:
	   	|Home|F Staff Recommendation|F/FI Team Recommendation|Modest Recommendation|High Option|S Recommendation|F Staff Recommendation 2.0|F/FI Team Recommendation 2.0|Bureau Passback|Special Reports|	   	
	   	
#PBI-000
@version:Release4.0
@scenario:test-2 
Scenario: Verify FY20 Bureau Appeal' tabs displayd for based on bureau selection 
		When I select 'Bureau Appeal' from Budget Area
		Then the following top level dropdown menu should display:
   	  	|Fiscal Year|Budget Area|Bureau|Operating Unit| 		
		And the following tabs should display:
	   	|Home|Budget|
#PBI-000
@version:Release4.0
@scenario:test-2 
Scenario: Verify FY20 'OMB Submission' tabs displayd for based on bureau selection 
		When I select 'OMB Submission' from Budget Area
		Then the following top level dropdown menu should display:
   	  	|Fiscal Year|Budget Area|Bureau|Operating Unit|		
		And the following tabs should display:
	   	|Home|Budget|Attributions|   	
	   	
#PBI-000
@version:Release4.01
@scenario:test-2 
Scenario: Verify FY20 'Executive Budget Summary' tabs displayd for based on bureau selection 
		When I select 'Executive Budget Summary' from Budget Area
		Then the following top level dropdown menu should display:
   	  	|Fiscal Year|Budget Area| 		
		And the following tabs should display:
	   	|Home|EBS| 	   		   	 	 	  	