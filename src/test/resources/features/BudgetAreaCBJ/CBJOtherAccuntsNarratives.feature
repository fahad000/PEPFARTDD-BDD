@cbj-other-account @reliable
Feature: CBJ Narrative Other Accounts Narrative
Background:
        Given that the 'FRA User' has logged into the facts info application
        And I view my 'Budget Formulation' tile 
#PBI-19535, 19537
@version:Release1.0
@scenario:test-2 @test
Scenario: Verify FY20 CBJ Other accoonts tab displayd for based on bureau selection 
		When I select 'Congressional Budget Justification' from Budget Area 		
		Then the following tabs should display:
	   	  	|Home| 
	   	  	|Budget|
	   	  	|Attributions|
	   	  	|Mission Objectives|
	   	  	|ESDF| 
	   	  	|Bureau Overview|
	   	  	|Other Accounts|
	   	  When I view the 'Other Accounts' tab
		  And the following top level dropdown menu should not display:
   	  	    |Operating Unit| 
   	  	    	   			
#PBI-19535, 19537
@version:Release1.0
@scenario:test-2 @save
Scenario: Verify buttons for Other Accounts narrative
		When I select 'Congressional Budget Justification' from Budget Area  
		When select the 'USAID Management' from the Bureau dropdown list
		When I view the 'Other Accounts' tab
		Then the 'Save' and 'Discard' buttons should be enabled				
#PBI-19535
@version:Release1.0
@scenario:test-2 
Scenario: Verify that the Correct Account Names and OUs (that are funded) populates
        When I select 'Congressional Budget Justification' from Budget Area 
		When select the 'USAID Management' from the Bureau dropdown list
		When I view the 'Other Accounts' tab						
        Then the following accounts should display in account dropdown list:        
	        |USAID Operational Accounts|
	    When selecting an 'USAID Operational Accounts' from above list that is funded 	
		Then the following OU should display in OU dropdwon list:
			|Overview|
#PBI-19535
@version:Release1.0
@scenario:test-2 
Scenario: Verify that the Correct Account Names and OUs(that are funded) populates
		When I select 'Congressional Budget Justification' from Budget Area 				
		When select the 'PM - Political-Military Affairs' from the Bureau dropdown list
		When I view the 'Other Accounts' tab	
        Then the following accounts should display in account dropdown list:
	        |Peacekeeping Operations|
			|International Military Education and Training|
			|Foreign Military Financing|
			|Conventional Weapons Destruction|
		When selecting an 'Peacekeeping Operations' from above list that is funded 	
		Then the following OU should display in OU dropdwon list:  
			|Overview|
#PBI-19535
@version:Release1.0
@scenario:test-2 
Scenario: Verify that the Correct Account Names and OUs (that are funded) populates				
		When select the 'ISN - International Security and Nonproliferation' from the Bureau dropdown list	
        Then the following accounts should display in account dropdown list:
	        |Export Control and Related Border Security Assistance|
			|Global Threat Reduction|
			|IAEA Voluntary Contribution|
			|Weapons of Mass Destruction Terrorism|
		 When selecting an 'Global Threat Reduction' from above list that is funded 
		 And the following OU should display in OU dropdwon list:
			|Overview|
#PBI-19535, 19537
@version:Release1.0
@scenario:test-2 
Scenario: Verify that the Correct Account Names and OUs (that are funded) populates				
		When select the 'CT - Bureau of Counterterrorism and Countering Violent Extremism' from the Bureau dropdown list	
        Then the following accounts should display in account dropdown list:
	        |Antiterrorism Assistance|
			|Terrorist Interdiction Program|
			|Counterterrorism Partnerships Fund|
			|Counterterrorism Financing|
			|CT Engagement with Allies|
		 When selecting an 'Antiterrorism Assistance' from above list that is funded 
		 And the following OU should display in OU dropdwon list:
			|Overview|
			
#PBI-19535, 19537
@version:Release1.0
@scenario:test-2 
Scenario: Verify that the Correct Account Names and OUs (that are funded) populates				
		When select the 'INL - International Narcotics and Law Enforcement Affairs' from the Bureau dropdown list	
        Then the following accounts should display in account dropdown list:
	        |International Narcotics Control and Law Enforcement|
	      When selecting an 'International Narcotics Control and Law Enforcement' from above list that is funded		
		 And the following OU should display in OU dropdwon list:
		 	|Overview|
		 	
#PBI-19535, 19537
@version:Release1.0
@scenario:test-2 
Scenario: Verify that the Correct Account Names and OUs (that are funded) populates				
		When select the 'DCHA - Democracy, Conflict, and Humanitarian Assistance' from the Bureau dropdown list	
        Then the following accounts should display in account dropdown list:
	        |International Disaster Assistance|
	        |Transition Initiatives|		
		 And the following OU should display in OU dropdwon list:
		 	|USAID Democracy, Conflict and Humanitarian Assistance (DCHA)|
		 	
#PBI-19535, 19537
@version:Release1.0
@scenario:test-2 
Scenario: Verify that the Correct Account Names and OUs (that are funded) populates				
		When select the 'S/GAC - Office of the Global AIDS Coordinator' from the Bureau dropdown list	
        Then the following accounts should display in account dropdown list:
	        |Global Health Programs|		
		 And the following OU should display in OU dropdwon list:
		 	|Overview|
#PBI-19535
@version:Release1.0
@scenario:test-2 
Scenario: Verify that the Correct Account Names and OUs (that are funded) populates				
		When select the 'GH - Global Health' from the Bureau dropdown list	
        Then the following accounts should display in account dropdown list:
	        |Global Health Programs|		
		 And the following OU should display in OU dropdwon list:
		 	|Overview|
#PBI-19535
@version:Release1.0
@scenario:test-2 
Scenario: Verify that the Correct Account Names and OUs (that are funded) populates				
		When select the 'PRM - Population, Refugees, and Migration' from the Bureau dropdown list	
        Then the following accounts should display in account dropdown list:
	        |Migration and Refugee Assistance|		
		 And the following OU should display in OU dropdwon list:
		 	|Overview|														||							